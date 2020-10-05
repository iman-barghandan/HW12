package domains;

import javax.persistence.*;

@Entity
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @Column(nullable = false)
    private Long charge;

    @Column(nullable = false,unique = true,length = 12)
    private String cardNumber;

    @Column(nullable = false)
    private String expirationDate;

    @Column(nullable = false,length = 3)
    private Integer cvv2;

    @Column(nullable = false)
    private String secondPassword;

    @OneToOne(mappedBy = "creditCard")
    private Account account;

    public CreditCard() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getCharge() {
        return charge;
    }

    public void setCharge(Long charge) {
        this.charge = charge;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Integer getCvv2() {
        return cvv2;
    }

    public void setCvv2(Integer cvv2) {
        this.cvv2 = cvv2;
    }

    public String getSecondPassword() {
        return secondPassword;
    }

    public void setSecondPassword(String secondPassword) {
        this.secondPassword = secondPassword;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
