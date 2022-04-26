import java.util.Scanner;

public class AssociationDemo {
    public static void main(String[] args) {
        System.out.println("Association B/W Employee and SmartCard");
        Employee e = new Employee();
        System.out.println("Employee is created");
        SmartCard s = new SmartCard();
        s.MarkAttedndence(e);
        e.login(s);
    }
}

class Employee {
    int emp_id;
    void employee(){
        System.out.println("Enter emp_id");
        Scanner sc = new Scanner(System.in);
        this.emp_id = sc.nextInt();
    }
    int getEmpid(){
        return emp_id;
    }
    public void login(SmartCard sc){
        int eid = sc.getEmpidn(this);
        System.out.println("Login Successfull");
    }
    
}

class SmartCard{
    int emp_idn;
    public void MarkAttedndence(Employee e) {
        emp_idn = e.getEmpid();
        System.out.println("Employee "+emp_idn+" is present.");
    }
    public int getEmpidn(Employee e) {
        return e.emp_id;
    }

}