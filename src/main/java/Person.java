public class Person {

    private final String fullName;
    private final String jobTitle;
    private final String email;
    private final String telephoneNumber;
    private final int salary;
    private final int age;

    public Person(String fullName, String jobTitle, String email, String telephoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployee() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", email='" + email + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
