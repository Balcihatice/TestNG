package techproed.tests.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.utilities.DataProviderUtils;

public class Day25_DataProviderTest4 {
    // Bu ornekte data provider metodumuz Util classdan


    //musteriVerileri
    @Test(dataProvider = "musteriVerileri", dataProviderClass = DataProviderUtils.class)
    public void musterVerileriTest(String userName, String password) {
        System.out.println("Username :" + userName + " . Password : " + password);
    }

    //musteriHizmetleriVerileri
    @Test(dataProvider = "musteriHizmetleriVerileri", dataProviderClass = DataProviderUtils.class)
    public void musteriHizmetleriVerileri(String userName, String password) {
        System.out.println(userName + "    |     " + password);
    }

    //personelverileri
    @Test(dataProvider = "personelVerileri", dataProviderClass = DataProviderUtils.class)
    public void personelVerileri(String userName, String password) {
        System.out.println(userName + "    |     " + password);
    }
}
