package day11.task1;

public class Courier implements Worker {
    private int salary;
    private Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setBalance(warehouse.getBalance() + 1000);


    }

    @Override
    public void bonus() {
        if (warehouse.getBalance() >= 1000000) {
            this.salary *= 2;
        }
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }
}
