package repositories;

import domains.CreditCard;

public class CreditCardRepositoryDAO extends BaseRepositoryDAO<CreditCard, Long> {
    private static CreditCardRepositoryDAO creditCardRepositoryDAO;

    private CreditCardRepositoryDAO() {
    }

    public static CreditCardRepositoryDAO getInstance() {
        if (creditCardRepositoryDAO == null) {
            creditCardRepositoryDAO = new CreditCardRepositoryDAO();
        }
        return creditCardRepositoryDAO;
    }


    @Override
    protected Class<CreditCard> getEntityClass() {
        return CreditCard.class;
    }
}
