package disburse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.ObjectMapper;

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
	
	@RequestMapping("all")
	public String getAllPage(Model model) {
		System.out.println("Get JPA all page...");
//		model.addAttribute("hdList", hdDAO.getListOfAllHDJpa());
		ObjectMapper om = new ObjectMapper();
		
		return "disburse.html";
	}

}
