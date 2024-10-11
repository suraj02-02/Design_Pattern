package decorator_Design.decorators;

import decorator_Design.basecomponents.Burger;

/**
 * <p>
 *    This is the base decorator used in <code>Decorator Pattern</code>.
 *    The <code>Base Decorator</code> will be extended by all the concrete decorators
 * </p>
 * <p>
 *     The decorator are meant to add or provide an additional featiure to the original object without modifying the original object and class.
 * </p>
 */
public abstract class BurgerDecorator extends Burger {

}
