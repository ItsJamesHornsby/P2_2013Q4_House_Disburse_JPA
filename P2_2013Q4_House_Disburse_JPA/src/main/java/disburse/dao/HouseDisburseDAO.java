package disburse.dao;

import org.springframework.beans.factory.annotation.Autowired;

import disburse.repository.HouseDisburseRepository;
import disburse.vo.HouseDisburseDetail;

public class HouseDisburseDAO {
	
	private HouseDisburseRepository hdr;
	// Setter injection below!
	@Autowired
	void setHouseDisburseRepository(HouseDisburseRepository hdr) {
		this.hdr = hdr;
	}
	
	HouseDisburseRepository getHouseDisburseRepository() {
		return hdr;
	}
	
	public HouseDisburseDetail getListOfAllHDJpa(Integer hdId) {
		HouseDisburseDetail hdd = hdr.findById(hdId);
		hdd.setBioGuideID(hdd.getBioGuideID());
		return hdd;
		
	}

}
