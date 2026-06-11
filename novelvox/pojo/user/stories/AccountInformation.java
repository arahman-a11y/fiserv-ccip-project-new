package novelvox.pojo.user.stories;

import lombok.Data;
import java.util.List;

public class AccountInformation {

    private List<Deposit> deposits;
    private List<Loan> loans;
    private List<DebitCard> debitCards;
}