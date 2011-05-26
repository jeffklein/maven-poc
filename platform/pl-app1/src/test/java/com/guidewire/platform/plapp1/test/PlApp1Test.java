package com.guidewire.platform.plapp1.test;

import com.guidewire.platform.plapp1.PlApp1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups={"integration"})
@ContextConfiguration(locations = "classpath:/com/guidewire/platform/plapp1/spring-beans-plapp1.xml")
public class PlApp1Test extends AbstractTestNGSpringContextTests {

  @Autowired(required = true)
  @Qualifier("plApp1")
  private PlApp1 plApp1 = null;

  @Test
  public void testPlApp1() {
    for (int i = 0 ; i < 10 ;i++) {
      new Thread(plApp1).start();
    }
  }

  @Test(groups={"unit"})
  public void someNoOpUnitTest() {
    logger.info("useless test with no assertions");
  }
}
