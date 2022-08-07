package com.example.config;

public interface Test {
  String getTest();

  public static class Test1 implements Test{

    @Override
    public String getTest() {
      return "test1";
    }
    
  }
  public static class Test2 implements Test{

    @Override
    public String getTest() {
      return "test2";
    }
    
  }
}
