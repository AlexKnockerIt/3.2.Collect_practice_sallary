public class Employee {
    private String name;
    private String occupation;
    private Integer salary;


    public Employee(String name, String occupation, Integer salary){
        this.name = name;
        this.salary = salary;
        this.occupation = occupation;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
