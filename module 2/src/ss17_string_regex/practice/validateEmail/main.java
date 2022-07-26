package ss17_string_regex.practice.validateEmail;

public class main {
    private static EmailExample validateEmail;
    public static final String[] vali = new String[]{"a@gmail.com","ab@yahoo.com","abc@hotmail.com"};
    public static final String[] inva = new String[]{"@gmail.com","ab@gmail.","@#abc@gmail.com"};

    public static void main(String[] args) {
        validateEmail = new EmailExample();

        for (String email : vali){
            boolean isvali = validateEmail.validate(email);
            System.out.println("   email is   " + email + "  valid   " + isvali);
        }

        for (String email : inva){
            boolean isvalid = validateEmail.validate(email);
            System.out.println("  email is  " + email + "  valid  " + isvalid);
        }
    }
}
