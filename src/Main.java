public class Main {

    public static void main(String[] args){

        Manager manager = new Manager();
        manager.setSalary(100000);
        manager.setCountOfWorker(1);

        Worker worker = new Worker();
        worker.setSalary(80000);

        Worker worker1 = new Manager();
        if (worker1 instanceof Manager){
            ((Manager)worker1).setCountOfWorker(2);
            worker1.setSalary(200000);
        }

        Worker[] array = {worker, manager, worker1};
        int sum = Salary.getSum(array);

        System.out.println(sum);

    }
}
