package template_Design;

import template_Design.template.DataProcessor;

/**
 * <p>This is one the <code>Concrete Class</code> for <code>Template Design Pattern</code></p>
 * <p>This implementation handles the processing of <code>JSON</code> data</p>
 */

public class JsonDataProcessor extends DataProcessor {

    @Override
    protected void readData() {
        System.out.println("Reading JSON data");
    }

    @Override
    protected void validateData() {
        System.out.println("Validating JSON data");
    }

    @Override
    protected void transformData() {
        System.out.println("Transforming JSON data");
    }

    @Override
    protected void storeData() {
        System.out.println("Storing JSON data");
    }
}
