public class Table {
    private String detail;
    private String sign;
    private double money;
    private double balance;

    public Table(String detail, String sign, double money,double balance) {
        this.detail = detail;
        this.sign = sign;
        this.money = money;
        this.balance=balance;
    }

    public String getDetail() {
        return detail;
    }

    public String getSign() {
        return sign;
    }

    public double getMoney() {
        return money;
    }
    public  double getBalance(){
        return balance;
    }

    @Override
    public String toString() {
        String tmp = "";
        tmp += detail + " : ";
        tmp += sign + money + ": ";
        tmp += balance;
        return tmp;
    }
}

