import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by achmudas on 11/12/14.
 */
public class RentTest {

    private Customer cust1 = new Customer("John");
    private Customer cust2 = new Customer("Peter");

    private Movie hobbit = new Movie("Hobbit", Movie.NEW_RELEASE);
    private Movie alice = new Movie("Alice", Movie.CHILDRENS);
    private Movie transformers = new Movie("Transformers", Movie.REGULAR);
    private Movie lordOfTheRings = new Movie("The Lord of the Rings", Movie.REGULAR);
    private Movie terminator = new Movie("Terminator", Movie.REGULAR);

    @Test
    public void testRentalsCust1() {
        cust1.addRental(new Rental(hobbit, 5));
        cust1.addRental(new Rental(lordOfTheRings, 1));
        cust1.addRental(new Rental(alice, 11));
        Assert.assertThat(cust1.statement(), Matchers.is("Rental Record for John\n" +
                "\tHobbit\t15.0\n" +
                "\tThe Lord of the Rings\t2.0\n" +
                "\tAlice\t13.5\n" +
                "Amount owed is 30.5\n" +
                "You earned 4 frequent renter points"));

    }

    @Test
    public void testRentalsCust2() {
        cust2.addRental(new Rental(transformers, 20));
        cust2.addRental(new Rental(terminator, 1));
        cust2.addRental(new Rental(alice, 11));
        cust2.addRental(new Rental(hobbit, 2));
        cust2.addRental(new Rental(lordOfTheRings, 1));
        Assert.assertThat(cust2.statement(), Matchers.is("Rental Record for Peter\n" +
                "\tTransformers\t29.0\n" +
                "\tTerminator\t2.0\n" +
                "\tAlice\t13.5\n" +
                "\tHobbit\t6.0\n" +
                "\tThe Lord of the Rings\t2.0\n" +
                "Amount owed is 52.5\n" +
                "You earned 6 frequent renter points"));
    }


}
