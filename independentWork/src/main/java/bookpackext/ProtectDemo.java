package bookpackext;

public class ProtectDemo {
    public static void main(String[] args) {
      ExtBook books[] = new ExtBook[5];

      books[0] = new ExtBook("Java: beginner's guide", "Herbert Shild", 2018, "Williams");
      books[1] = new ExtBook("Java: complete guide", "Herbert Shild", 2018, "Williams");
      books[2] = new ExtBook("The art of java programming", "Herbert Shild", 2005, "Dialectics");
      books[3] = new ExtBook("Red storm rises", " Tom Clancy", 2006, "Exmo");
      books[4] = new ExtBook("On the road", "Jack Kerouac", 2012, "ABC");

      for (int i = 0; i < books.length; i++) books[i].show();

      System.out.println("All books Herbert Shild");
      for (int i = 0; i < books.length; i++) {
          if (books[i].getAuthor() == "Herbert Shild") {
              System.out.println(books[i].getTitle());
          }
          //   books[0].title = "test title";   Error, access is denied!
      }
    }
}
