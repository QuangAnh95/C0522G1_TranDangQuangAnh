package ss17_string_regex.exercise.ValidatePhoneNumber;

public class Main {
    public static final String[] text = new String[]{"(84)-(0978489648)","(a8)-(22222222)"};

    public static void main(String[] args) {

        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();

        for (String account : text){
            boolean isvalid = validatePhoneNumber.validate(account);
            System.out.println(" số điện thoại:   "  + account + "   tính hợp lệ:  " + isvalid);
        }


    }

}
