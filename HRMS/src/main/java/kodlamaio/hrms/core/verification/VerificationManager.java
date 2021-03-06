package kodlamaio.hrms.core.verification;

import java.util.UUID;

import org.springframework.stereotype.Service;


@Service
public class VerificationManager implements VerificationService {

	@Override
	public void sendLink(String email) {
		UUID uuid = UUID.randomUUID();
		String verificationLink = "https://hrmsverification/" + uuid.toString();
		System.out.println("Verification mail has been send to : " + email);
		System.out.println("Click on the link and verify your account: " + verificationLink);
	}

	@Override
	public void sendCode(String email) {
		UUID uuid = UUID.randomUUID();
		String verificationCode = uuid.toString();
		System.out.println("Verification link has been sen to : " + email);
		System.out.println("Your activation code : " + verificationCode);
	}
	
}
