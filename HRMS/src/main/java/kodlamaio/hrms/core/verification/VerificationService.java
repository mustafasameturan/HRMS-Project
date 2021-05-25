package kodlamaio.hrms.core.verification;

import kodlamaio.hrms.core.utilities.results.Result;

public interface VerificationService {
	Result sendLink(String email);
	void sendCode(String email);
	
}
