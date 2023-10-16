package pl.pingvit.homework9;

import java.util.Arrays;

public class DepositMain {
    public static void main(String[] args) {
        DepositBox depositBox1 = new DepositBox(1, "1234th", new String[]{"цепь,серьги,кольцо"});
        DepositBox depositBox2 = new DepositBox(2, "1235th", new String[]{"слиток золота"});
        DepositBox depositBox3 = new DepositBox(3, "1236th", new String[]{"аблигации"});
        DepositBox depositBox4 = new DepositBox(4, "1237th", new String[]{"документы"});
        DepositBox depositBox5 = new DepositBox(5, "1238th", new String[]{"оружие"});

        DepositBox[] depositBoxes = {depositBox1, depositBox2, depositBox3, depositBox4, depositBox5};

        System.out.println(Arrays.toString(depositBox2.extractValuables("1236th")));

        BankWarehouse bankWarehouse = new BankWarehouse("StorageFirst", depositBoxes);

        System.out.println(bankWarehouse.next());
        System.out.println(bankWarehouse.next());
        System.out.println(bankWarehouse.next());
        System.out.println(bankWarehouse.next());
        System.out.println(bankWarehouse.next());
        System.out.println(bankWarehouse.next());
    }
}
