package com.guidewire.commons.handy;

/**
 * A really lame util class.
 */
public class HandyUtil {
  public String reverseString(String in)
  {
    return new StringBuffer(in).reverse().toString();
  }
}
