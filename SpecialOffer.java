import java.io.Serializable;
import java.util.Date;

public class SpecialOffer implements Serializable {

    private static final long serialVersionUID = 1L;

    private Date startDate;
    private Date endDate;
    private String name;
    private double amount;

    public SpecialOffer(Date startDate, Date endDate, String name, double amount) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.name = name;
        this.amount = amount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "SpecialOffer{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
