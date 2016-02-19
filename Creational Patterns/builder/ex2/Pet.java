package builder.ex2;

import java.util.Date;

/* Builder Pattern */
public class Pet {
	private final Animal animal;
	private final String petName;
	private final String ownerName;
	private final String address;
	private final String telephone;
	private final Date dateOfBirth; // optional
	private final String emailAddress; // optional

	/* Builder is a static member class of the class it builds */
	public static class Builder {
		private Animal animal;
		private String petName;
		private String ownerName;
		private String address;
		private String telephone;
		private Date dateOfBirth;
		private String emailAddress;

		/*
		 * Builder setter method return the builder itself so the invocations
		 * can be chained
		 */
		public Builder withAnimal(final Animal animal) {
			this.animal = animal;
			return this;
		}

		/*
		 * Builder setter method return the builder itself so the invocations
		 * can be chained
		 */
		public Builder withPetName(final String petName) {
			this.petName = petName;
			return this;
		}

		/*
		 * Builder setter method return the builder itself so the invocations
		 * can be chained
		 */
		public Builder withOwnerName(final String ownerName) {
			this.ownerName = ownerName;
			return this;
		}

		/*
		 * Builder setter method return the builder itself so the invocations
		 * can be chained
		 */
		public Builder withAddress(final String address) {
			this.address = address;
			return this;
		}

		public Builder withTelephone(final String telephone) {
			this.telephone = telephone;
			return this;
		}

		/*
		 * Builder setter method return the builder itself so the invocations
		 * can be chained
		 */
		public Builder withDateOfBirth(final Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
			return this;
		}

		/*
		 * Builder setter method return the builder itself so the invocations
		 * can be chained
		 */
		public Builder withEmailAddress(final String emailAddress) {
			this.emailAddress = emailAddress;
			return this;
		}

		/*
		 * Build method calls the actual constructor and returns the actual
		 * object we are trying to build. With the build method we can validate
		 * the domain-legal object before creating it.
		 */
		public Pet build() {
			if (animal == null || petName == null || ownerName == null || address == null || telephone == null) {
				throw new IllegalStateException("Cannot create Pet");
			}

			return new Pet(animal, petName, ownerName, address, telephone, dateOfBirth, emailAddress);
		}

	}

	private Pet(final Animal animal, final String petName, final String ownerName, final String address,
			final String telephone, final Date dateOfBirth, final String emailAddress) {
		this.animal = animal;
		this.petName = petName;
		this.ownerName = ownerName;
		this.address = address;
		this.telephone = telephone;
		this.dateOfBirth = dateOfBirth;
		this.emailAddress = emailAddress;
	}

	/* Getter method for the immutable class Pet */
	public Animal getAnimal() {
		return animal;
	}

	/* Getter method for the immutable class Pet */
	public String getPetName() {
		return petName;
	}

	/* Getter method for the immutable class Pet */
	public String getOwnerName() {
		return ownerName;
	}

	/* Getter method for the immutable class Pet */
	public String getAddress() {
		return address;
	}

	/* Getter method for the immutable class Pet */
	public String getTelephone() {
		return telephone;
	}

	/* Getter method for the immutable class Pet */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/* Getter method for the immutable class Pet */
	public String getEmailAddress() {
		return emailAddress;
	}
}