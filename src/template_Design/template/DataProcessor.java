package template_Design.template;

/**
 * <p>This is the abstract class for <code>Template Design Pattern</code></p>
 * <p>It acts as a template for <code>Concrete Class</code></p>
 */
public abstract class DataProcessor {

    /**
     *  This is the <code>Template Method</code> in <code>Template Design Pattern</code>
     *  It will have some fixed sequence of operations which can be overridden by subclasses to provide additional functionality.
     */
    public final void process() {
        readData();
        validateData();
        transformData();
        storeData();
    }

    /**
     *  Below provided abstract methods will be implemented by <code>Concrete Class</code>
     *  If there is some common functionality that can be used by all the <code>Concrete Class</code> can be implemented here itself.
     */
    protected abstract void readData();
    protected abstract void validateData();
    protected abstract void transformData();
    protected abstract void storeData();

}
