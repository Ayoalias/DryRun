package co.uk.dryrun.hooks;

import co.uk.dryrun.commons.browserManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends browserManager {
    @Before
    public void setUp() {

        launchBrowser("Chrome");
    }

    @After
    public void tearDown() {

        closeBrowser();
    }
}
