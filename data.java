interface Employee {
    String getDetails();
}

interface Manager extends Employee {
    String getDeptDetails();
}

class Head implements Manager {
    public int empId;
    public String empName;
    public int deptId;
    public String deptName;

    public Head(int empId, String empName, int deptId, String deptName) {
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
        this.deptName = deptName;
    }
    public String getDetails() {
        return "Employee ID: " + empId + "\nEmployee Name: " + empName;
    }
    public String getDeptDetails() {
        return "Department ID: " + deptId + "\nDepartment Name: " + deptName;
    }
    public void printAllDetails() {
        System.out.println(getDetails());
        System.out.println(getDeptDetails());
    }
}
public class Main {
    public static void main(String[] args) {
        Head head = new Head(22051591, "NICE NEWTON", 10, "Marketing");
        head.printAllDetails();
    }
}

