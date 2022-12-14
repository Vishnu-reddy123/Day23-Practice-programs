import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface checklambda{
    public String format(String name);
}

public class UserRegistrationDetail {

    public static void main(String[] args) {
        //first Name
        checklambda obj = (name)->{
            String nameCheck = "[A-Z]{1}[a-z]{3,6}";
            Pattern pattern = Pattern.compile(nameCheck);
            Matcher fmatcher = pattern.matcher(name);
            if(fmatcher.matches()) {
                return"Valid Input";
            }
            else {
                return "Invalid Input";
            }
        };
        System.out.println(obj.format("Vishnu"));


        //last Name
        checklambda lastName = (name)->{
            String nameCheck = "[A-Z]{1}[a-z]{3,6}";
            Pattern pattern = Pattern.compile(nameCheck);
            Matcher fmatcher = pattern.matcher(name);
            if(fmatcher.matches()) {
                return"Valid Input";
            }
            else {
                return "Invalid Input";
            }
        };
        System.out.println(lastName.format("Reddy"));

        //Email ID
        checklambda emailIdCheck = (enteredValue)->{
            String emailCheck = "[a-z]{3,}(.+)[a-z]{3}@[bl](.+)[co](.+)";
            Pattern pattern = Pattern.compile(emailCheck);
            Matcher email = pattern.matcher(enteredValue);
            if(email.matches()) {
                return"Valid Input";
            }
            else {
                return "Invalid Input";
            }
        };
        System.out.println(emailIdCheck.format("vishnu955.xyz@bl.co"));

        //Mobile Number
        checklambda mobileNumber = (enteredValue)->{
            String mobileCheck = "(91)?[7-9][0-9]{9}";
            Pattern pattern = Pattern.compile(mobileCheck);
            Matcher email = pattern.matcher(enteredValue);
            if(email.matches()) {
                return"Valid Input";
            }
            else {
                return "Invalid Input";
            }
        };
        System.out.println(mobileNumber.format("919553275711"));

        //password checking
        checklambda password = (enteredValue)->{
            String passwordCheck = "^(?=.*[@!#$%&*?])(?=.*[0-9])(?=.*[A-Z])[a-zA-Z0-9@!#$%&*?]{8,}$";
            Pattern pattern = Pattern.compile(passwordCheck);
            Matcher email = pattern.matcher(enteredValue);
            if(email.matches()) {
                return"Valid Input";
            }
            else {
                return "Invalid Input";
            }
        };
        System.out.println(password.format("Vishnu@95532"));
    }
}