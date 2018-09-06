import java.util.ArrayList;

public class Account {
    private ArrayList<Table> table = new ArrayList<Table>();
    private double balance=0;
    public  void addData(String detail,String sign,double money){

        if(sign.equals("+")){
            balance+=money;
        }else if(sign.equals("-")){
            balance-=money;
        }
        table.add(new Table(detail,sign,money,balance));
    }

    public ArrayList<Table> getTable() {
        return table;
    }

    @Override
    public String toString() {
        String tmp = "";
        for (Table t : table) {
            tmp += t.toString() + "\n";
        }
        return tmp;
    }

    public double getBalance() {
        return balance;
    }
}
