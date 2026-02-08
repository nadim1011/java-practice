package university.exception;

public class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}



package university.exception;

public class DepartmentException extends Exception {
    public DepartmentException(String message) {
        super(message);
    }
}




package university.validation;

import university.exception.AgeException;
import university.exception.DepartmentException;

public class Validator {

    public static void validateAge(int age) throws AgeException {
        if (age < 18 || age > 60) {
            throw new AgeException("Invalid Age! Age must be between 18 and 60.");
        }
    }

    public static void validateDepartment(String dept) throws DepartmentException {
        if (!(dept.equalsIgnoreCase("CSE") ||
              dept.equalsIgnoreCase("EEE") ||
              dept.equalsIgnoreCase("BBA"))) {

            throw new DepartmentException("Invalid Department! Only CSE, EEE, BBA allowed.");
        }
    }
}
