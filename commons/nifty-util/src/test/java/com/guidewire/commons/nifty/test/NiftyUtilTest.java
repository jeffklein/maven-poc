package com.guidewire.commons.nifty.test;

import com.guidewire.commons.nifty.NiftyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Test the Nifty utility
 */
@Test
@ContextConfiguration(locations = "classpath:/com/guidewire/commons/nifty/spring-beans-nifty-util.xml")
public class NiftyUtilTest extends AbstractTestNGSpringContextTests {

  @Autowired(required = true)
  @Qualifier("niftyUtilBean")
  private NiftyUtil niftyUtil = null;

  @Test
  public void testNiftyUtil() {
    int length = niftyUtil.determineLength("Ain't this string nifty the first time?");
    logger.info(length);
    Assert.assertEquals(length, 39);
    Assert.assertNotNull(length);
  }

  @Test
  public void testNiftyUtil10Times() {
    for (int i = 1; i <= 10; i++) {
      String in = "See, its still nifty even inside a loop! " + i;
      int length = niftyUtil.determineLength(in);
      Assert.assertNotNull(length);

      boolean nifty = niftyUtil.isNifty(in);
      if (nifty) {
        logger.info("NiftyUtil reports that the input was "+length+" chars in length. That's one nifty string!");
      }
      else {
        logger.info("NiftyUtil reports that the input was "+length+" chars in length. String is NOT NIFTY- better check your input");
      }

      Assert.assertTrue(nifty);
    }
  }
}
