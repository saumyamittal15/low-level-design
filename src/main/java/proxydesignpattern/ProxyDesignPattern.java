package proxydesignpattern;

public class ProxyDesignPattern {
    public static void main(String[] args) {
        try{
            EmployeeDao employeeDao = new EmployeeDaoProxy();
            employeeDao.create("USER", new EmployeeDo());
            System.out.println("Operation Successful");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
