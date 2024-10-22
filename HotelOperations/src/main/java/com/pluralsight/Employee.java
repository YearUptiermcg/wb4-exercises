public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    // Constructor
    public Employee(int employeeId, String name, String department, double payRate, float hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        if (hoursWorked > 40) {
            float overtimehours = hoursWorked - 40;
            double regularPay = 40 * payRate;
            double overtimePay = overtimehours * payRate * 1.5;
            return regularPay = overtimePay;
        } else {
            return this.payRate * this.hoursWorked
    }
}
    public float getRegularHours(){
        return 0;
    }
    public float getOvertimeHours(){
        return 0;
    }

