package decorator_Design.basecomponents;

/**
 * <p>
 *   This is the base component used in <code>Decorator Pattern</code>.
 *   The <code>Base Component</code> will be extended by all the concrete components
 *   </p>
 *   <p>
 *     The base component contains the common properties of all the concrete components.
 *   </p>
 */

public abstract  class Burger {

         private String name;
         private String description;
         private int cost;

         public abstract String getName();
         public abstract String getDescription();
         public abstract int getCost();


}
