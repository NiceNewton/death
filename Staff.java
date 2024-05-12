abstract class Staff {
  private String name;
  private String address;

  public Staff(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public abstract void displayDetails();
}

class FullTimeStaff extends Staff {
  private String department;
  private float salary;

  public FullTimeStaff(String name, String address, String department, float salary) {
    super(name, address);
    this.department = department;
    this.salary = salary;
  }

  @Override
  public void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("Address: " + address);
    System.out.println("Department: " + department);
    System.out.println("Salary: " + salary);
  }
}

class PartTimeStaff extends Staff {
  private int numberOfHours;
  private float ratePerHour;

  public PartTimeStaff(String name, String address, int numberOfHours, float ratePerHour) {
    super(name, address);
    this.numberOfHours = numberOfHours;
    this.ratePerHour = ratePerHour;
  }

  @Override
  public void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("Address: " + address);
    System.out.println("Number of Hours: " + numberOfHours);
    System.out.println("Rate Per Hour: " + ratePerHour);
  }
}
