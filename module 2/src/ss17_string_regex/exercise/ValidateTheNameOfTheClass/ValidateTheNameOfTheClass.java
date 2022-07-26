package ss17_string_regex.exercise.ValidateTheNameOfTheClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateTheNameOfTheClass {
    /**
     * Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
     *
     * Không chứa các ký tự đặc biệt
     *
     * Theo sau ký tự bắt đầu là 4 ký tự số
     *
     * Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M
     */

    private static final String CLASS_REGEX = "^[CAP][0-9]{4}[G-M]$";

    public ValidateTheNameOfTheClass() {

    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
