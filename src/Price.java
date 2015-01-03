/**
 * Created by achmudas on 03/01/15.
 */
abstract class Price {
    abstract int getPriceCode();

   abstract double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented) {
            return 1;
    }
}
