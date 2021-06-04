package kodlamaio.hrms.core.utilities.adapters.mernisAdapter;

import java.time.LocalDate;

public interface UserCheckService {
	boolean checkIfRealPerson(String firstName, String lastName, String identityNumber, LocalDate birthOfYear);
}
