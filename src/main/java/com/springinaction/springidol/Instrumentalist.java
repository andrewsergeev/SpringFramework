package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("eddie")
public class Instrumentalist implements Performer {
  public void perform() throws PerformanceException {
    instrument.play();
  }

  @Autowired
  @Qualifier("piano")
  private Instrument instrument;

  public Instrument getInstrument() {
    return instrument;
  }
}
