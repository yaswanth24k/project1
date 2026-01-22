public class Transactions {
    private String transactionId;
    private String senderId;
    private String receiverId;
    private String paymentType;
    private double amount;


    public Transactions(String transactionId, String senderId, String receiverId, String paymentType, double amount) {
        this.transactionId = transactionId;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.paymentType = paymentType;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "transactionId='" + transactionId + '\'' +
                ", senderId='" + senderId + '\'' +
                ", receiverId='" + receiverId + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", amount=" + amount +
                '}';
    }
}
