package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("eddie")
public class Instrumentalist implements Performer {
  @Autowired
  public void perform() throws PerformanceException {
    instrument.play();
  }

  @Autowired
  @Qualifier("guitar")
  private Instrument instrument;

  public void setInstrument(Instrument instrument) {
    this.instrument = instrument;
  }

  public Instrument getInstrument() {
    return instrument;
  }
}
