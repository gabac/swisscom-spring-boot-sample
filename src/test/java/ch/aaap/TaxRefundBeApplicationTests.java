package ch.aaap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import ch.aaap.taxrefund.TaxRefundBeApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TaxRefundBeApplication.class)
@WebAppConfiguration
public class TaxRefundBeApplicationTests {

	@Test
	public void contextLoads() {
	}

}
