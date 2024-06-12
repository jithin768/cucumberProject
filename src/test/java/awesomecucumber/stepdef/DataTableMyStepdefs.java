package awesomecucumber.stepdef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.List;

public class DataTableMyStepdefs {


    @Given("my credentials")
    public void my_credentials(io.cucumber.datatable.DataTable dataTable) {
        List<String> creds=dataTable.values();
        System.out.println("UserName= " +creds.get(0));
        System.out.println("Password= " +creds.get(1));

    }

}
