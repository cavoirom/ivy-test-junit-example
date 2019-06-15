package com.cavoirom.ivy.junit.example;

import ch.ivyteam.ivy.environment.Ivy;
import com.cavoirom.ivy.test.runner.IvyTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(IvyTestRunner.class)
public class IvyEnvironmentTest {

  @Test
  public void should_run_log_on_ivy_engine() {
    Ivy.log().warn("This log is on Ivy Environment.");
    Assert.assertEquals(1, 1);
  }
}
