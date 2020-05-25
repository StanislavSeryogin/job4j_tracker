package bookpackext;

import packegesAndInterfaces.*;

public class UseBook {
    public static void main(String[] args) {
   Book books[] = new packegesAndInterfaces.Book[5];

    books[0] = new Book("Java: beginner's guide", "Herbert Shild", 2018);
    books[1] = new Book("Java: complete guide", "Herbert Shild", 2018);
    books[2] = new Book("The art of java programming", "Herbert Shild", 2005);
    books[3] = new Book("Red storm rises", " Tom Clancy", 2006);
    books[4] = new Book("On the road", "Jack Kerouac", 2012);

    for (int i = 0; i < books.length; i++) books[i].show();
    }
}
