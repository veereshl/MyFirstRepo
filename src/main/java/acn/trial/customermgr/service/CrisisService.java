package acn.trial.customermgr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acn.trial.customermgr.entities.Crisis;
import acn.trial.customermgr.repositories.CrisisRepository;

@Service
public class CrisisService {
	
	private CrisisRepository crisisRepository;
	
	@Autowired
	public CrisisService(CrisisRepository crisisRepository) {
		this.crisisRepository = crisisRepository;
	}



	public Crisis createCrisis(Crisis crisis) {
		return crisisRepository.save(crisis);
	}
	
	public List<Crisis> getAllCrisis(){
		List<Crisis> crisisList = crisisRepository.findAll();
		return crisisList;
	}
	
	public Crisis getById(Integer id) {
		return crisisRepository.getOne(id);
	}
	
	public void deleteCrisis(Integer id) {
		if (crisisRepository.findById(id) != null) {
			crisisRepository.deleteById(id);
		}
	}

}
