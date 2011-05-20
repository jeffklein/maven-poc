package com.guidewire.commons.nifty;

/**
 * A nifty utility
 */
public class NiftyUtil {
  public int determineLength(String in)
  {
    return in.length();
  }

  public boolean isNifty(String in)
  {
    return determineLength(in) <= 43;
  }
}
