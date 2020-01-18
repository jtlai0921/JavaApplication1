
import java.util.ArrayList;


public class EmployeeDAOMemoryImpl implements EmployeeDAO {

    // 遙控器陣列，10支遙控器，尚未控制任何員工物件
    private final Employee[] employees = new Employee[10];
    
   
    @Override
    public void add(Employee emp) {
        int index = emp.getId();  // 1
        employees[index] = emp;
    }

    @Override
    public void update(Employee emp) {
        int index = emp.getId();
        employees[index] = emp;
    }

    @Override
    public void delete(int id) {
        int index = id;
        employees[index] = null;
    }

    @Override
    public Employee findById(int id) {
        int index = id;
        return employees[index];
    }

    @Override
    public Employee[] getAllEmployees() {
        ArrayList<Employee> list = new ArrayList();
        for (Employee e : employees) {
            if (e != null) {
                list.add(e);
            }
        }
        return list.toArray(new Employee[0]); // list 轉 陣列
    }
}
