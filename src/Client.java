public class Client {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.TPBANK);
        System.out.println(bank.getBankName());

        Bank bank2 = BankFactory.getBank((BankType.VIETCOMBANK));
        System.out.println(bank2.getBankName());
    }
}
