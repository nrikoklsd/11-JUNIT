import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(JUnitPlatform.class)
@Suite.SuiteClasses({CalculatorTest2.class,CalculatorTest2.class, CheckAsserts.class})
public class JunitTestSuite {

}