package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Entity.Labour;
import Service.LabourService;

@RestController
public class LabourController {
	
	@Autowired
	public LabourService labourService;
	
	@GetMapping("/home")
	public String Home()
	{
		return "hello";
	}
	
	@PostMapping("/addLabour")
	public Labour addLabour(@RequestBody Labour labour)
	{
		return labourService.save(labour);
	}

}
