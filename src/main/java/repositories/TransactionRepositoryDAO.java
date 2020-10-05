package repositories;

import domains.Transaction;

public class TransactionRepositoryDAO extends BaseRepositoryDAO<Transaction, Long> {

    private static TransactionRepositoryDAO transactionRepositoryDAO;

    private TransactionRepositoryDAO() {
    }

    public static TransactionRepositoryDAO getInstance() {
        if (transactionRepositoryDAO == null) {
            transactionRepositoryDAO = new TransactionRepositoryDAO();
        }
        return transactionRepositoryDAO;
    }


    @Override
    protected Class<Transaction> getEntityClass() {
        return Transaction.class;
    }
}
