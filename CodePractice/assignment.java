public class assignment {

    public static void main(String args[]){
        Employee employee1= new Employee("jirhehb","siarpha",35,70,776.0);
        System.out.println("Value of idCounter : " + Employee.getIdCounter());
        Employee employee2= new Employee("ycrdzsi","voivkqr",32,87,484.0);
        System.out.println("Value of idCounter : " + Employee.getIdCounter());
        Employee employee3= new Employee("txdxrzv","azpjbbb",4,63,369.0);
        System.out.println("Value of idCounter : " + Employee.getIdCounter());
        Employee employee4= new Employee("pefjukm","mctpbqe",36,0,951.0);
        System.out.println("Value of idCounter : " + Employee.getIdCounter());
        Employee employee5= new Employee("shbrzke","lpcnymz",51,86,181.0);
        System.out.println("Value of idCounter : " + Employee.getIdCounter());
    }
}

class Employee{

    static int id;
    private String name;
    private String designation;
    private int ssnNo;
    private int age;
    private double salary;

    public Employee(String name, String designation, int ssnNo, int age, double salary){
        
        this.name=name;
        this.designation=designation;
        this.ssnNo=ssnNo;
        this.age=age;
        this.salary=salary;
    }

    static int getIdCounter(){
        return id = id + 1;
    }
    public String getName(){
        return name;
    }
    public String getDesignation(){
        return designation;
    }
    public int getSsnNo(){
        return ssnNo;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }

   

    public void setName(String name){
        this.name=name;
    }


    public void setDesignation(String designation){
        this.designation=designation;
    }

    public void setSsnNo(int ssnNo){
        this.ssnNo=ssnNo;
    }

    
    public void setAge(int age){
        this.age=age;
    }
    
    public void setSalary(double salary){
        this.salary=salary;
    }

}