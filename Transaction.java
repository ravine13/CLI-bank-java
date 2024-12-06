import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Transaction {
    private String type;
    private double amount;
    private LocalDateTime timestamp;
    private double balanceAfterTransaction;


    public Transaction(String type, double amount, double balanceAfterTransaction){
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
        this.balanceAfterTransaction = balanceAfterTransaction;
    }

    public String geType(){
        return type;
    }
    public double getAmount(){
        return amount;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

       @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return "[" + timestamp.format(formatter) + "] " +
               type + ": " + amount +
               ", Balance After: " + balanceAfterTransaction;
    }
}
