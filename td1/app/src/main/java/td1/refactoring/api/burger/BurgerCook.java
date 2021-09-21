package td1.refactoring.api.burger;

public interface BurgerCook {
    BurgerCook with_cheese();

    BurgerCook with_onions();

    BurgerCook with_sauce(BurgerSauce sauce);

    BurgerCook with_tomato();

    Burger cook();
}