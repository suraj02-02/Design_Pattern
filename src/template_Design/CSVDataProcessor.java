package template_Design;

import template_Design.template.DataProcessor;

/**
 * <p>This is one the <code>Concrete Class</code> for <code>Template Design Pattern</code></p>
 * <p>This implementation handles the processing of <code>CSV</code> data</p>
 */

public class CSVDataProcessor extends DataProcessor {

    @Override
    protected void readData() {
       System.out.println("Reading CSV data");
    }

    @Override
    protected void validateData() {
       System.out.println("Validating CSV data");
    }

    @Override
    protected void transformData() {
      System.out.println("Transforming CSV data");
    }

    @Override
    protected void storeData() {
       System.out.println("Storing CSV data");
    }
}
