package Interface;

public class Main {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        Worker worker1 = new Worker("worker1", 100);
        Worker worker2 = new Worker("worker2", 10);
        Worker worker3 = new Worker("worker3", 55);
        Worker worker4 = new Worker("worker4", 80);
        Worker worker5 = new Worker("worker5", 11);

        Worker[] workers = {
                new Worker("worker1", 5),
                new Worker("worker2", 15),
                new Worker("worker3", 25),
                new Worker("worker4", 40),
        };

        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i]);
        }

        int sumSalaries = 0;
        for(Worker worker : workers) {
            sumSalaries += worker.sumAllSalaries();
        }
        System.out.printf("все зарплаты: %d", sumSalaries);

        worker1.addMoney(57);
        System.out.println();
        System.out.println(worker1.getSalary());

        hospital.getAccept(worker1);
        hospital.getAccept(worker2);
        hospital.showPattients();

    }
}
