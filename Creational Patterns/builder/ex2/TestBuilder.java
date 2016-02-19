package builder.ex2;

public class TestBuilder {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		final Pet.Builder builder = new Pet.Builder();
		final Pet pet = builder
				.withAnimal(Animal.CAT)
				.withPetName("Squidge")
				.withOwnerName("Simon Smith")
				.withAddress("123 High Street")
				.withTelephone("07777777770")
				.withEmailAddress("simon@email.com")
				.build();
		// test pass - no exception thrown

		final Pet.Builder builder1 = new Pet.Builder();
		final Pet pet1 = builder
				.withAnimal(Animal.DOG)
				.withPetName("Fido")
				.withOwnerName("Simon Smith")
				.build();
	}
}