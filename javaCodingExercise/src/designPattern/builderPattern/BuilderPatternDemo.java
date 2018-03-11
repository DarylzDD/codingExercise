package builderPattern;

/*
 * http://www.runoob.com/design-pattern/builder-pattern.html
 * 
 * */


public class BuilderPatternDemo {

	public static void main(String[] args) {
		
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal mealVeg = mealBuilder.prepareVegMeal();
		
		System.out.println("1. Veg Meal:");
		mealVeg.showItems();
		System.out.println("cost: "+mealVeg.getCost());
		
		System.out.println("-----------------------------");
		
		Meal mealNonVeg = mealBuilder.prepareNonVegMeal();
		
		System.out.println("2. Non veg Meal:");
		mealNonVeg.showItems();
		System.out.println("cost: "+mealNonVeg.getCost());
		
	}
}
