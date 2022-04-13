package disburse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import disburse.repository.HouseDisburseRepository;
import disburse.vo.HouseDisburseDetail;

@RestController
public class CRMRestController {

	@Autowired
	private HouseDisburseRepository hdRepo;
	
	@PostMapping("/loadDisburse")
	public List<HouseDisburseDetail> loadList(@RequestBody final List<HouseDisburseDetail> hdList) {
		//System.out.println(hdList.get(0).toString());
		hdRepo.saveAll(hdList);
		return hdRepo.findByYear("2020");
	}
	
}