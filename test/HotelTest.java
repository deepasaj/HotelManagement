import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HotelTest {

    private Hotel x;

    @Before
    public void setUp() throws Exception {
        x = new X(new Customer("Regular"), new String[]{"16Mar2010(sun)", "19Mar2010(wed)"});
    }

    @Test
    public void shouldTestWhetherGivenDateIsWeekEnd() throws Exception {
        assertTrue(x.isWeekEnd(x.getDates()[0]));
        assertFalse(x.isWeekEnd(x.getDates()[1]));
    }

    @Test
    public void shouldGetTotalPrice() throws Exception {
        assertEquals(220, x.getTotalPrice());
    }
}
