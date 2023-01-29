public interface ATMInterface {
    Customer deposit(Customer Customer);

    Customer withdraw(Customer customer);

    Customer checkBal(Customer Customer);
}
