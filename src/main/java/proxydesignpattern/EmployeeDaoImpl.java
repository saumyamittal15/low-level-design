package proxydesignpattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        System.out.println("Created");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Deleted");
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        System.out.println("Fetching data");
        return new EmployeeDo();
    }
}
