package springwork.customAnnotations;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator


implements ConstraintValidator<PasswordConstraint, String>{

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX =Pattern.compile ("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*(_|[^\\w])).+$"
					Pattern.Case);
	@Override
	public void initialize(PasswordConstraint arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		
		boolean isValid = false;
		if(arg0.contains(arg0))
		
		return false;
	}

	
}
