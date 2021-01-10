import java.util.regex.Matcher;
import java.util.regex.Pattern;

//
//public class EmailExample {
//    private Pattern pattern;
//    private Matcher matcher;
//
//    private final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
//
//    public EmailExample() {
//        this.pattern = Pattern.compile(EMAIL_REGEX);
//    }
//    public boolean validate(String regex){
//        matcher = pattern.matcher(regex);
//        return matcher.matches();
//    }
//
//}
public class EmailExample {
    private Pattern pattern;
    private Matcher matcher;
    private final String EMAIL_REGEX = "[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailExample(){
        pattern = Pattern.compile(EMAIL_REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
