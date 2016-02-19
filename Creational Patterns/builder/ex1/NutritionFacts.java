package builder.ex1;

/* Builder Pattern from Bloch-Effective Java*/
public class NutritionFacts {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	/* Builder is a static member class of the class it builds */
	public static class Builder {
		// Required parameters
		private final int servingSize;
		private final int servings;
		// Optional parameters - initialized to default values
		private int calories = 0;
		private int fat = 0;
		private int carbohydrate = 0;
		private int sodium = 0;

		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		/*
		 * Builder setter method return the builder itself so the invocations
		 * can be chained
		 */
		public Builder calories(int val) {
			calories = val;
			return this;
		}

		/*
		 * Builder setter method return the builder itself so the invocations
		 * can be chained
		 */
		public Builder fat(int val) {
			fat = val;
			return this;
		}

		/*
		 * Builder setter method return the builder itself so the invocations
		 * can be chained
		 */
		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}

		/*
		 * Builder setter method return the builder itself so the invocations
		 * can be chained
		 */
		public Builder sodium(int val) {
			sodium = val;
			return this;
		}

		/*
		 * Build method calls the actual constructor and returns the actual
		 * object we are trying to build
		 */
		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}

	private NutritionFacts(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}

	/* Getter method for the immutable class NutritionFacts */
	public int getServingSize() {
		return servingSize;
	}

	/* Getter method for the immutable class NutritionFacts */
	public int getServings() {
		return servings;
	}

	/* Getter method for the immutable class NutritionFacts */
	public int getCalories() {
		return calories;
	}

	/* Getter method for the immutable class NutritionFacts */
	public int getFat() {
		return fat;
	}

	/* Getter method for the immutable class NutritionFacts */
	public int getSodium() {
		return sodium;
	}

	/* Getter method for the immutable class NutritionFacts */
	public int getCarbohydrate() {
		return carbohydrate;
	}
}