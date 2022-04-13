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
	
	public List<HouseDisburseDetail> getListOfAllHDJpa() {
		List<HouseDisburseDetail> hdd = hdr.findAll();
		for (HouseDisburseDetail hd1 : hdd ) {
			hd1.setOffice(hd1.getOffice().toLowerCase());
		}
		return hdd;
		
	}

	public List<HouseDisburseDetail> getHDById(String hdId) {
		List<HouseDisburseDetail> hd = hdr.findBybioGuideID(hdId);
		return hd;
	}
	
	public List<HouseDisburseDetail> getHighestAmount() {
		List<HouseDisburseDetail> hd = hdr.getHighestAmount();
		return hd;
	}

}
