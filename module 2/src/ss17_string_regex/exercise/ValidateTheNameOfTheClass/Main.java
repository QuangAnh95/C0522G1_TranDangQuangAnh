package ss17_string_regex.exercise.ValidateTheNameOfTheClass;



public class Main {

    public static final String[] text = new String[]{"C0318G","M0318G","P0323A"};

    public static void main(String[] args) {
        ValidateTheNameOfTheClass validateTheNameOfTheClass = new ValidateTheNameOfTheClass();

        for (String account : text){
            boolean isvalid = validateTheNameOfTheClass.validate(account);
            System.out.println(" tên lớp:   "  + account + "   tính hợp lệ:  " + isvalid);
        }


    }
}
