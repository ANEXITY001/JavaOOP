package Interface;

import java.util.ArrayList;

public class Hospital implements Hospotable, Financeble {
    private String name;
    private ArrayList<Worker> pattients;
    private int wallet;


    public Hospital() {
        this.pattients = new ArrayList<>();
        this.wallet = 0;
    }

    public void showPattients() {
        int count = 0;
        for(Worker w : pattients) {
            System.out.println(++count + ". " + w.getName());
        }
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wsllet) {
        this.wallet = wsllet;
    }

    public ArrayList<Worker> getPattients() {
        return pattients;
    }

    public void setPattients(ArrayList<Worker> pattients) {
        this.pattients = pattients;
    }

    @Override
    public String toString() {
        return "Госпиталь{" +
                ", пациенты = " + pattients + "}";
    }

    @Override
    public int sumAllSalaries() {
        return 0;
    }

    @Override
    public String getMySalary(int amount) {
        return "";
    }

    @Override
    public int pay(int amount) {
        return wallet + amount;
    }

    @Override
    public void getAccept (Worker worker) {
        pattients.add(worker);
        System.out.println("новый пациент был добавлен");
    }
}
