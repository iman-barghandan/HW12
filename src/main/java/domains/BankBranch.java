package domains;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BankBranch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @Column(nullable = false,unique = true)
    private String bankBranchName;

    @OneToMany(mappedBy = "bankBranch", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Account> accountList = new ArrayList<>();


    public BankBranch() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public String getBankBranchName() {
        return bankBranchName;
    }

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }
}
