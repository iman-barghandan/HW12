package services;

import domains.BankBranch;
import repositories.BankBranchRepositoryDAO;

import java.util.List;

public class BankBranchService {
    BankBranchRepositoryDAO bankBranchRepositoryDAO = BankBranchRepositoryDAO.getInstance();

    public void createBankBranch(String bankBranchName)
    {
        BankBranch bankBranch = new BankBranch();
        bankBranch.setBankBranchName(bankBranchName);
        bankBranchRepositoryDAO.save(bankBranch);
    }

    public void selectBranchBanks()
    {
        List<BankBranch> bankBranchList =  bankBranchRepositoryDAO.selectAll();
        if (bankBranchList.size()>0)
        {
            for (BankBranch item : bankBranchList)
            {
                System.out.println("Id: " + item.getId());
                System.out.println("BankBranchName: " + item.getBankBranchName());
                System.out.println("------------");
            }
        }
        else System.out.println("there is no bank!");
    }
}
