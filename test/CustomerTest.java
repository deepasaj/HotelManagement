import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CustomerTest {

    private Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Regular");
    }

    @Test
    public void shouldCreateCustomerInstance() throws Exception {

        assertThat(customer, is(not(nullValue())));
    }

    @Test
    public void shouldReturn0WhenTypeIsRegular() throws Exception {
        assertEquals(0, customer.getType());
    }
}
