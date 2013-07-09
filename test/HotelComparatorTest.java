import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelComparatorTest {

    private X x;
    private Y y;
    private HotelComparator hotelComparator;
    private Z z;

    @Before
    public void setUp() throws Exception {
        x = new X(new Customer("Regular"), new String[]{"16Mar2010(sun)", "19Mar2010(wed)"});
        y = new Y(new Customer("Regular"), new String[]{"16Mar2010(sun)", "19Mar2010(wed)"});
        z = new Z(new Customer("Regular"), new String[]{"16Mar2010(sun)", "19Mar2010(wed)"});
        hotelComparator = new HotelComparator();
    }

    @Test
    public void shouldTestIfReturnedValueIsMinusOneIfHotelBPriceIsGreaterThanHotelA() throws Exception {

        assertEquals(-1, hotelComparator.compare(x, y));
    }

    @Test
    public void shouldTestIfReturnedValueIsOneIfHotelAPriceIsGreaterThanHotelB() throws Exception {
        assertEquals(1, hotelComparator.compare(y, x));
    }

    @Test
    public void shouldTestIfReturnedValueIsMinusOneIfBothHotelsHaveSamePriceButHotelAHasHigherRating() throws Exception {
        x.setTotal(100);
        y.setTotal(100);
        assertEquals(-1, hotelComparator.compare(x, y));
    }

    @Test
    public void shouldTestIfReturnedValueIsMinusIfBothHotelsHaveSamePriceButHotelBHasHigherRating() throws Exception {
        x.setTotal(100);
        y.setTotal(100);
        assertEquals(1, hotelComparator.compare(y, x));
    }
}
