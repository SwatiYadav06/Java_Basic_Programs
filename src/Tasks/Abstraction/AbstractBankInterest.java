package Tasks.Abstraction;

public class AbstractBankInterest {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
    }
}

abstract class Bank {
    abstract double getInterestRate();
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 7.0;
    }
}