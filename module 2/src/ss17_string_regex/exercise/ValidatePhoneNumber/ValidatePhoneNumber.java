package ss17_string_regex.exercise.ValidatePhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    /**
     * Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)
     *
     * x là ký tự số
     *
     * Không chứa các ký tự đặc biệt
     */

    public ValidatePhoneNumber() {
    }
    private static final String CLASS_REGEX = "[(][0-9]{2}[)][-][(][0][0-9]{9}[)]";

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
