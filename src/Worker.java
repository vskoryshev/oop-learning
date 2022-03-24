public class Worker extends Person {

    private int salary;

    boolean isSameName(Worker worker){
        return this.getName().equals(worker.getName());
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

}
