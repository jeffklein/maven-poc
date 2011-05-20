package com.guidewire.platform.plapp1;

import com.guidewire.commons.handy.HandyUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


/**
 * A make believe platform app
 */
public class PlApp1 implements Runnable, ApplicationContextAware {

  private HandyUtil handy;

  private static final Log _log = LogFactory.getLog(PlApp1.class);

  public PlApp1(HandyUtil handy) {
    this.handy = handy;
  }

  public String doSomethingHandy(String in) {
    return "In platform app1. reversed string is: "+handy.reverseString(in);
  }

  @Override
  public void run() {
    _log.info(doSomethingHandy(new Double(Math.random()).toString()));
  }

  /**
   * called by spring when bean is instantiated.
   * I just put this in here to demonstrate debugging in 3rd party sources ;)
   * @param applicationContext
   * @throws BeansException
   */
  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    Object handyBean = applicationContext.getBean("handyUtilBean");
    _log.info("found a handy bean in the spring context: "+handyBean);
  }
}
