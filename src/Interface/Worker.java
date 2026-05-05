package Interface;

public class Worker implements Financeble {
    private String name;
    private  int salary;


    public int sumAllSalaries() {
        return this.salary;
    }

    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int addMoney (int fund) {
        salary += fund;
        return salary;
    }

    @Override

    public String getMySalary(int amount) {
        return "Зарплата: " + amount + "добавлена";
    }

    @Override
    public int pay(int amount) {
        return salary - amount;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "работник{" +
                "имя = " + name + '\'' +
                ", зарплата = " + salary + "}";
    }
}


//TODO 5.1 - 2 новых интерфейса
// Payble - помогатеот объектам товаров
//  1- возвращает double - GetFinalPrice
//  2- void - pay с параметром double(amount)
//  3- bool - isPaid
// Financible - помогате объектам клиентам
//  1- double - ChekBalance (без параметра)
//  2- bool - HasEnouthMoney (double emouth)
//  3-String - GetFinalsesStatus (без параметра)
// 5.2 - необходимо все классы расширять при помощи Hashcode, equals, instanceof и подобного
// 5.3 - сравнивать объекты по цвету, названию и.т.д