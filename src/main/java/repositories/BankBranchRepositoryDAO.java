package repositories;

import domains.BankBranch;

public class BankBranchRepositoryDAO extends BaseRepositoryDAO<BankBranch, Long> {

    private static BankBranchRepositoryDAO bankBranchRepositoryDAO;

    private BankBranchRepositoryDAO() {
    }

    public static BankBranchRepositoryDAO getInstance() {
        if (bankBranchRepositoryDAO == null) {
            bankBranchRepositoryDAO = new BankBranchRepositoryDAO();
        }
        return bankBranchRepositoryDAO;
    }

    @Override
    protected Class<BankBranch> getEntityClass() {
        return BankBranch.class;
    }
}
