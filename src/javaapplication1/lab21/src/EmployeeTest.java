
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeTest {

    static Scanner sc = new Scanner(System.in);
    static EmployeeDAO dao;

    public static void main(String[] args) {

        EmployeeDAOFactory factory = new EmployeeDAOFactory();
        dao = factory.createEmployeeDAO();

        String action = null;
        while (true) {
            System.out.println("------------------------------------------------------------");
            System.out.println("[C]reate | [R]ead | [U]pdate | [D]elete | [L]ist | [Q]uit: ");
            action = sc.next().toUpperCase(); // 輸入字串轉大寫
            switch (action) {
                case "C":
//                    add();
                    break;
                case "R":
//                    read();
                    break;
                case "U":
//                    update();
                    break;
                case "D":
//                    delete();
                    break;
                case "L":
//                    list();
                    break;
                case "Q":
                    System.exit(0); // 結束程式
            }
        }

    }


}
