import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ZTest {
    @Test
    public void shouldCheckNameAndRating() throws Exception {
        Z z = new Z(new Customer("Regular"), new String[]{"", ""});
        assertThat(z, is(not(nullValue())));

        assertEquals("z", z.getName());
        assertEquals(4, z.getRating());

    }
}
