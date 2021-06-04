package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CvTalentService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvTalentDao;
import kodlamaio.hrms.entities.concretes.CvTalent;

@Service
public class CvTalentManager implements CvTalentService {

	private CvTalentDao cvTalentDao;
	
	@Autowired
	public CvTalentManager(CvTalentDao cvTalentDao) {
		super();
		this.cvTalentDao = cvTalentDao;
	}

	@Override
	public DataResult<List<CvTalent>> getAll() {
		return new SuccessDataResult<List<CvTalent>>(this.cvTalentDao.findAll(), "listed");
	}

	@Override
	public DataResult<CvTalent> getById(int cvTalentId) {
		return new SuccessDataResult<CvTalent>(this.cvTalentDao.getOne(cvTalentId));
	}

	@Override
	public Result add(CvTalent cvTalent) {
		this.cvTalentDao.save(cvTalent);
		return new SuccessResult("added");
	}

	@Override
	public Result delete(int cvTalentId) {
		this.cvTalentDao.deleteById(cvTalentId);
		return new SuccessResult("deleted");
	}

}
