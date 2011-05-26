package com.guidewire.platform.plapp2.test;

import com.guidewire.platform.plapp2.PlApp2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = {"functional"})
@ContextConfiguration(locations = "classpath:/com/guidewire/platform/plapp2/spring-beans-plapp2.xml")
public class PlApp2Test extends AbstractTestNGSpringContextTests {

  @Autowired(required = true)
  @Qualifier("plApp2")
  private PlApp2 plApp2 = null;

  @Test
  public void testPlApp2() {
    String niftyString = "This is a nifty string!";
    String reverseNiftyStr = plApp2.reverseNiftyString(niftyString);
    Assert.assertEquals(niftyString.length(), reverseNiftyStr.length());
    Assert.assertTrue(reverseNiftyStr.startsWith("!"));

    String notNiftyStr = "This string is way to long to be nifty. Don't you wish this string was shorter so it could be nifty?";
    String newReverseNiftyStr = plApp2.reverseNiftyString(notNiftyStr);
    Assert.assertEquals(newReverseNiftyStr.length(), 43);
  }
}
