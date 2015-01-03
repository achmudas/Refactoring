/**
 * Created by achmudas on 03/01/15.
 */
public class NewReleasePrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    double getCharge(int daysRented) {
        double result = 0;
        return result += daysRented * 3;
    }

    @Override
    int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 :1;
    }
}
