package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Labour;
import Repository.LabourRepository;

@Service
public class LabourService {
	
	@Autowired
	public LabourRepository labourRepository;
	
	
	
	public Labour save(Labour labour) {
		
		return labourRepository.save(labour);
	}
	

}
