package template_Design;

import template_Design.template.DataProcessor;

/**
 *  This is a demonstration of <code>Template Design Pattern</code>
 */
public class Client {

    public static void main(String[] args) {

        /**
         * Template pattern is a Behavioral Design Pattern where an abstract class exposes defined way(s)/template(s) to execute its methods.
         * Its subclasses can override the method implementation as per need but the invocation is to be in the same way as defined by an abstract class.
         * The template method will have some fixed sequence of operations which can be overridden by subclasses to provide additional functionality.
         *
         * This pattern is useful when handling different variations of the same sequence of operations.
         *
         * Components we have while building the code using <code>Template Pattern</code>
         *        1. Abstract Class -  @see {@link DataProcessor}
         *        2. Template Method - @see {@link DataProcessor#process()} This is method in abstract class that will call the various methods in specified sequence
         *        3. Concrete Class - @see {@link JsonDataProcessor}, {@link CSVDataProcessor}
         *
         * Use Case :
         *  1. Data Processing in a Data Pipeline - Steps like reading, validating, transforming, and storing data.
         *  2. Report Generation - Generating different types of reports (e.g., PDF, Excel, CSV) following a common process.
         *  3. Payment Processing - A generic payment flow with steps like validation, processing, and response handling.
         *  4. User Authentication - Standardizing authentication with steps like data extraction, verification, and response.
         *
         *  Problem Statement : We will be building a Data processing pipeline using <code>Template Pattern</code>
         *
         */

        // Start Processing of Json data
         DataProcessor dataProcessor = new JsonDataProcessor();
         dataProcessor.process();

         System.out.println();
         // Start Processing of CSV data
         DataProcessor csvDataProcessor = new CSVDataProcessor();
         csvDataProcessor.process();

    }
}
