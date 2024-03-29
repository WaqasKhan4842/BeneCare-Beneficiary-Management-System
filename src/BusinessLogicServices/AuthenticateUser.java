package BusinessLogicServices;

import DataAcces.UserRepository;

public class AuthenticateUser {
	private final static UserRepository userRepository = new UserRepository();

	public static boolean authenticateUser(String enteredUsername, String enteredPassword,String selectedUserType) {
			        // Use the UserRepository to validate user credentials
	        return userRepository.validateUserCredentials(enteredUsername, enteredPassword,selectedUserType);
	 
	}

}
