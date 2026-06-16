package novelvox.dao;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;

import novelvox.common.Commons;
import novelvox.pojo.user.stories.CustomerDetails;
import novelvox.pojo.user.stories.FpDataObject2;

public class CustomersDao {

    public static List<CustomerDetails> getCustomers() {
        try {
                return Commons.customerData;
        } catch (Exception e) {
            throw new RuntimeException("Failed to parse customer dataset", e);
        }
    }

    public static FpDataObject2 getFpDataObject2() {
        try {
                return Commons.fpDataObject2;
        } catch (Exception e) {
            throw new RuntimeException("Failed to parse fpDataObject2 dataset", e);
        }
    }
}
