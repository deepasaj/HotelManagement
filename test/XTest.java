import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class XTest {
    @Test
    public void shouldTestNameAndRatingOfHotel() throws Exception {
        X x = new X(new Customer("Regular"), new String[]{"16Mar2010(sun)", "19Mar2010(wed)"});

        assertThat(x,is(not(nullValue())));
        assertEquals(x.getName() , "x");
        assertEquals(x.getRating() , 5);
    }
}
