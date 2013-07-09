import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class YTest {
    @Test
    public void shouldTestNameAndRatingOfHotel() throws Exception {
        Y y = new Y(new Customer("Regular"), new String[]{"16Mar2010(sun)", "19Mar2010(wed)"});

        assertThat(y,is(not(nullValue())));
        assertEquals(y.getName() , "y");
        assertEquals(y.getRating() , 5);
    }
}
