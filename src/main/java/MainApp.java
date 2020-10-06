import controller.MainMenu;
import domains.CreditCard;
import repositories.CreditCardRepositoryDAO;
import services.InformationCard;

public class MainApp {
    public static void main(String[] args) {

        MainMenu.showMenu();

//        CreditCardRepositoryDAO creditCardRepositoryDAO = CreditCardRepositoryDAO.getInstance();
//        CreditCard creditCard = new CreditCard();
//        InformationCard informationCard = new InformationCard();
//        String cardNumber = informationCard.getCardNumber();
//        creditCard.setCardNumber(cardNumber);
//        String cvv2 = informationCard.getCVV2();
//        creditCard.setCvv2(cvv2);
//        creditCard.setCharge(1000L);
//        String expirationDate = informationCard.ExpirationDate();
//        creditCard.setExpirationDate(expirationDate);
//        creditCard.setSecondPassword("1905");
//        creditCardRepositoryDAO.save(creditCard);
    }
}
