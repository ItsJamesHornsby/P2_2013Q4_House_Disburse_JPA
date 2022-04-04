package disburse.dao;

import org.springframework.beans.factory.annotation.Autowired;

import disburse.repository.HouseDisburseRepository;

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

}
