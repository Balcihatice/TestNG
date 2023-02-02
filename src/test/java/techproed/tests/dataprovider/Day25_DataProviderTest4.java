package techproed.tests.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.utilities.DataProviderUtils;

public class Day25_DataProviderTest4 {
    // Bu ornekte data provider metodumuz Util classdan


    //musteriVerileri
    @Test(dataProvider = "musteriVerileri", dataProviderClass = DataProviderUtils.class)
    public void musterVerileriTest(String userName, String password,String sube) {
        System.out.println("Username :" + userName + " . Password : " + password+ " . Sube : "+ sube);
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


    //    customerData
    @Test(dataProvider = "customerData",dataProviderClass = DataProviderUtils.class)
    public void customerDataTest(String username,String password){
        System.out.println("EXCEL DATALARIM");
        System.out.println(username + " ||| "+password);
    }



}
