package builder.ex3;

/* Builder Pattern */
public class LibraryBook {
	private final BookType bookType;
	private final String bookName;

	/* Builder is a static member class of the class it builds */
	public static class Builder {
		// Default field value
		private BookType bookType = BookType.FICTION;
		private String bookName;

		/*
		 * Builder setter method return the builder itself so the invocations
		 * can be chained. Its not necessary to call this method of builder, as it
		 * sets a default field.
		 */
		public Builder withBookType(final BookType bookType) {
			this.bookType = bookType;
			return this;
		}

		/*
		 * Builder setter method return the builder itself so the invocations
		 * can be chained
		 */
		public Builder withBookName(final String bookName) {
			this.bookName = bookName;
			return this;
		}

		/*
		 * Build method calls the actual constructor and returns the actual
		 * object we are trying to build.
		 */
		public LibraryBook build() {
			return new LibraryBook(bookType, bookName);

		}
	}

	public LibraryBook(final BookType bookType, final String bookName) {
		this.bookType = bookType;
		this.bookName = bookName;
	}

	/* Getter method for the immutable class LibraryBook */
	public BookType getBookType() {
		return bookType;
	}

	/* Getter method for the immutable class LibraryBook */
	public String getBookName() {
		return bookName;
	}
}