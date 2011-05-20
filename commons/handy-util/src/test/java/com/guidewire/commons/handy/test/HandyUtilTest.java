package com.guidewire.commons.handy.test;

import com.guidewire.commons.handy.HandyUtil;
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
@ContextConfiguration(locations = "classpath:/com/guidewire/commons/handy/spring-beans-handy-util.xml")
public class HandyUtilTest extends AbstractTestNGSpringContextTests {

  @Autowired(required = true)
  @Qualifier("handyUtilBean")
  private HandyUtil handyUtil = null;

  @Test
  public void testHandyUtil() {
    String reversedStr = handyUtil.reverseString("NUF");
    logger.info("ISN'T THIS "+reversedStr+"?!?!");
    Assert.assertEquals(reversedStr, "FUN");
    Assert.assertNotNull(reversedStr);
  }
}
