

public class EmployeeDAOFactory {

    public EmployeeDAO createEmployeeDAO() {
        
        return new EmployeeDAOMemoryImpl();// 將來可更換不同的 DAO 實作
    }
    
}
