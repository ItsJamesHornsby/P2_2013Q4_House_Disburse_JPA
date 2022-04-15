package disburse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
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
	//Challenge 1
	@RequestMapping("all")
	public String getAllPage(Model model) {
		//System.out.println("Get JPA all page...");
		model.addAttribute("hdList", hdDAO.getListOfAllHDJpa());
		//ObjectMapper om = new ObjectMapper();
		return "disburse.html";
	}
	//Challenge 2
	@GetMapping("bioGuideID/{id}")
	public String getHDbyID(@PathVariable String id, Model model) throws JsonProcessingException {
		model.addAttribute("hdList", hdDAO.getHDById(id));
		return "disburse.html";
	}
	//Challenge 4
	@GetMapping("highestAmount")
	public String getHighestAmount(Model model) {
		model.addAttribute("hdList", hdDAO.getHighestAmount());
		return "disburse.html";
	}
	//Challenge 3
	@RequestMapping("changeCategory")
	public String changeCategory(Model model) {
		model.addAttribute("hdList", hdDAO.updateCategory());
		return "disburse.html";
	}

}
