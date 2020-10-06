package services;

import domains.BankBranch;
import repositories.BankBranchRepositoryDAO;

public class BankBranchService {
    BankBranchRepositoryDAO bankBranchRepositoryDAO = BankBranchRepositoryDAO.getInstance();

    public void createBankBranch(String bankBranchName)
    {
        BankBranch bankBranch = new BankBranch();
        bankBranch.setBankBranchName(bankBranchName);
        bankBranchRepositoryDAO.save(bankBranch);
    }
}
