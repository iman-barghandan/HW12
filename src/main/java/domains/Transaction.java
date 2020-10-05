package domains;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false , updatable = false)
    private Date transactionDate;

    @Column(nullable = false)
    private Long cost;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(nullable = false, name = "fk_account")
    private Account account;

    @Column(nullable = false)
    private String creditCardDestination;

    public Transaction() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getCreditCardDestination() {
        return creditCardDestination;
    }

    public void setCreditCardDestination(String creditCardDestination) {
        this.creditCardDestination = creditCardDestination;
    }
}
