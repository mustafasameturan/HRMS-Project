package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvTalent;

public interface CvTalentService {
	DataResult<List<CvTalent>> getAll();
	DataResult<CvTalent> getById(int cvTalentId);
	
	Result add(CvTalent cvTalent);
	Result delete(int cvTalentId);
}
