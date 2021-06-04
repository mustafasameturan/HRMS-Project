package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CvJobExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvJobExperinceDao;
import kodlamaio.hrms.entities.concretes.CvJobExperience;

@Service
public class CvJobExperienceManager implements CvJobExperienceService  {

	private CvJobExperinceDao cvJobExperinceDao;
	
	@Autowired
	public CvJobExperienceManager(CvJobExperinceDao cvJobExperinceDao) {
		super();
		this.cvJobExperinceDao = cvJobExperinceDao;
	}

	@Override
	public DataResult<List<CvJobExperience>> getAll() {
		return new SuccessDataResult<List<CvJobExperience>>(this.cvJobExperinceDao.findAll(), "listed");
	}
	
	@Override
	public DataResult<List<CvJobExperience>> getAllByCvIdOrderByFinishingDateDesc(int cvId) {
		return new SuccessDataResult<List<CvJobExperience>>(this.cvJobExperinceDao.getAllByCvIdOrderByFinishingDateDesc(cvId));
	}


	@Override
	public Result add(CvJobExperience cvJobExperience) {
		this.cvJobExperinceDao.save(cvJobExperience);
		return new SuccessResult("added");
	}

	@Override
	public Result delete(int id) {
		this.cvJobExperinceDao.deleteById(id);
		return new SuccessResult("deleted");
	}

}
