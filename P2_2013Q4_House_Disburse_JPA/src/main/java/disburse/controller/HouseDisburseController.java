package disburse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import disburse.dao.HouseDisburseDAO;

@Controller
public class HouseDisburseController {
	
	public HouseDisburseDAO hdDAO;
	
	@Autowired
	void setHouseDisburseDAO(HouseDisburseDAO hdDAO) {
		this.hdDAO = hdDAO;
	}
	
	HouseDisburseDAO getHouseDisburseDAO() {
		return hdDAO;
	}

}