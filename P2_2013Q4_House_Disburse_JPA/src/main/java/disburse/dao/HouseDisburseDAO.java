package disburse.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import disburse.repository.HouseDisburseRepository;
import disburse.vo.HouseDisburseDetail;
@Service
public class HouseDisburseDAO {
	
	private HouseDisburseRepository hdr;
	// Setter injection below!
	@Autowired
	void setHouseDisburseRepository(HouseDisburseRepository hdr) {
		this.hdr = hdr;
	}
	
	public HouseDisburseRepository getHouseDisburseRepository() {
		return hdr;
	}
	//Challenge 1
	public List<HouseDisburseDetail> getListOfAllHDJpa() {
		List<HouseDisburseDetail> hdd = hdr.findAll();
		for (HouseDisburseDetail hd1 : hdd ) {
			hd1.setOffice(hd1.getOffice().toLowerCase());
		}
		return hdd;
		
	}
	//Challenge 2
	public List<HouseDisburseDetail> getHDById(String hdId) {
		List<HouseDisburseDetail> hd = hdr.findBybioGuideID(hdId);
		return hd;
	}
	//Challenge 4
	public List<HouseDisburseDetail> getHighestAmount() {
		List<HouseDisburseDetail> hd = hdr.getHighestAmount();
		return hd;
	}
	
	//Challenge 3
	  public List<HouseDisburseDetail> updateCategory() {
		  List<HouseDisburseDetail>
		  hdList = hdr.findAll();
		  for (HouseDisburseDetail hd : hdList) {
			   if(hd.getCategory().equals("TRAVEL")) {
				   //System.out.println("Travel here!");
				  hd.setCategory("T");
			  } else if(hd.getCategory().equals("FRANKED MAIL")) {
			  		hd.setCategory("FM");
			  } else if(hd.getCategory().equals("PERSONNEL COMPENSATION")) {
			  		hd.setCategory("PC");
			  } else if(hd.getCategory().equals("RENT")) {
			  		hd.setCategory("R");
			  } else if(hd.getCategory().equals("EQUIPMENT")) {
			  		hd.setCategory("E");
			  } else if(hd.getCategory().equals("OTHER SERVICES")) {
			  		hd.setCategory("OS");
			  } else if(hd.getCategory().equals("SUPPLIES AND MATERIALS")) {
			  		hd.setCategory("SM");
			  } else if(hd.getCategory().equals("PRINTING AND REPRODUCTION")) {
			  		hd.setCategory("PR");
			  }
		  } return hdList;
	  }
	 

		/*
		 * public List<HouseDisburseDetail> updateCategory() { List<HouseDisburseDetail>
		 * hdList1 = hdr.updateCategories(); List<HouseDisburseDetail> hdList =
		 * hdr.findAll(); return hdList; }
		 */
	
}
