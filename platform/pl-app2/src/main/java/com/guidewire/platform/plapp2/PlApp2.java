package com.guidewire.platform.plapp2;

import com.guidewire.commons.handy.HandyUtil;
import com.guidewire.commons.nifty.NiftyUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * Another make believe platform app
 */
public class PlApp2 {

  private HandyUtil handyUtil;

  private NiftyUtil niftyUtil;

  private static final Log _log = LogFactory.getLog(PlApp2.class);

  public PlApp2(HandyUtil handy, NiftyUtil nifty) {
    this.handyUtil = handy;
    this.niftyUtil = nifty;
  }

  public String reverseNiftyString(final String in) {
    if (niftyUtil.isNifty(in)) {
      return handyUtil.reverseString(in);
    }

    return handyUtil.reverseString(in.substring(0,43));
  }

}
