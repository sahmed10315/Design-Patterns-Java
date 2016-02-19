package builder.ex3;

public class TestBuilder {
	@SuppressWarnings("unused")
	public static void main(String [] args) {
		final LibraryBook.Builder builder = new LibraryBook.Builder();
        final LibraryBook book = builder
                .withBookName("War and Peace")
                .build();
	}
}