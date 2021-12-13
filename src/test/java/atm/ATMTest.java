package atm;

import junit.framework.TestCase;

public class ATMTest extends TestCase {

    public void testProcess() {
        ATM atm = new ATM();
        atm.process(135);
    }
}