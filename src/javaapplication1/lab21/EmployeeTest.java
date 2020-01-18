
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
                    add();
                    break;
                case "R":
                    read();
                    break;
                case "U":
                    update();
                    break;
                case "D":
                    delete();
                    break;
                case "L":
                    list();
                    break;
                case "Q":
                    System.exit(0); // 結束程式
            }
        }

    }

    // 新增
    public static void add() {
        Employee emp = inputEmployee();
        dao.add(emp);
        System.out.println("Successfully added Employee Record: " + emp.getId());
        System.out.println("\n\nCreated " + emp);
    }

    // 刪除
    public static void delete() {
       
    }

    // 查詢
    private static void read() {

        System.out.println("Enter int value for employee id: ");
        int id = sc.nextInt();

        // Find this Employee record
        Employee emp = dao.findById(id);
        if (emp != null) {
            System.out.println(emp + "\n");
        } else {
            System.out.println("\n\nEmployee " + id + " not found");
        }

    }

    // 修改
    public static void update() {
        
    }

    // 列出所有資料
    public static void list() {

    }
    
    // 輸入員工資料
    public static Employee inputEmployee() {
        
        int id = 0;
        String firstName = null;
        String lastName = null;
        Date birthDate = null;
        float salary = 0F;

        System.out.println("Enter int value for employee id: ");
        id = sc.nextInt();

        System.out.println("Enter value for employee first name");
        firstName = sc.next();
        
        System.out.println("Enter value for employee last name");
        lastName = sc.next();
        
        System.out.println("Enter value for employee birth date (yyyy-MM-dd)");
        String s = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            birthDate = sdf.parse(s);
        } catch(ParseException e) { System.out.println("日期格式錯誤"); }
        
        System.out.println("Enter float value for employee salary");
        salary = sc.nextFloat();
        
        return new Employee(id, firstName, lastName, birthDate, salary);
    }
        

}
