package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CvLanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvLanguageDao;
import kodlamaio.hrms.entities.concretes.CvLanguage;

@Service
public class CvLanguageManager implements CvLanguageService {
	
	private CvLanguageDao cvLangauegeDao;
	
	@Autowired
	public CvLanguageManager(CvLanguageDao cvLangauegeDao) {
		super();
		this.cvLangauegeDao = cvLangauegeDao;
	}

	@Override
	public DataResult<List<CvLanguage>> getAll() {
		return new SuccessDataResult<List<CvLanguage>>(this.cvLangauegeDao.findAll(), "listed");
	}

	@Override
	public DataResult<CvLanguage> getById(int cvLanguageId) {
		return new SuccessDataResult<CvLanguage>(this.cvLangauegeDao.getOne(cvLanguageId));
	}

	@Override
	public Result add(CvLanguage cvLanguage) {
		this.cvLangauegeDao.save(cvLanguage);
		return new SuccessResult("added");
	}

	@Override
	public Result delete(int cvLanguageId) {
		this.cvLangauegeDao.deleteById(cvLanguageId);
		return new SuccessResult("deleted");
	}

	
}
