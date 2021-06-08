import java.util.*;
class EmployeeMain {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the name:");
    String name = scan.nextLine();
        System.out.println("Enter the address:");
    String address = scan.nextLine();
        System.out.println("Enter the mobile:");
    String mobile = scan.nextLine();
    Employee em = new Employee();
    em.setName(name);
    em.setaddress(address);
    em.setmobile(mobile);
    System.out.println(em);

  }
}
class Employee {
    private String name;
    private String address;
    private String mobile;

    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public String getaddress() {
        return address;
    }
    public void setaddress(final String address) {
        this.address = address;
    }
    public String getmobile() {
        return mobile;
    }
    public void setmobile(final String mobile) {
        this.mobile = mobile;
    }
    public String toString() {
        return 
        "\n \n Employee Details : \n Name: " + getName() + "\n Address: " + getaddress() + "\n Mobile: " + getmobile() + "";
    }
}