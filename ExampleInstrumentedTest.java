package zwingvendor.in.roxfort.zwingvendor;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;


import in.roxfort.zwingvendor.R;
import in.roxfort.zwingvendor.modules.authentication.login_activity.LoginActivity;
import in.roxfort.zwingvendor.modules.authentication.activities.EnterPinActivity;
import in.roxfort.zwingvendor.modules.landing.LandingActivity;
import in.roxfort.zwingvendor.modules.landing.adapter.HomeItemsAdapter;




import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;


import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExampleInstrumentedTest {

    private static  final String string_number="2110087009";
    private static  final String string_number1="2110000009";
    private static  final String string_pinno="1234";

    public static void wait(int ms){
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }


     @Rule
     public ActivityTestRule<LoginActivity> rule = new ActivityTestRule<>(LoginActivity.class);
     public ActivityTestRule<EnterPinActivity> newrule = new ActivityTestRule<>(EnterPinActivity.class);
     public ActivityTestRule<LandingActivity> newnewrule = new ActivityTestRule<>(LandingActivity.class);




    @Before
    public void setUp(){
        closeSoftKeyboard();
    }


    @Test
    public void userLogin() throws InterruptedException {
        onView(withId(R.id.edt_phoneNumber)).perform(typeText(string_number1));
        closeSoftKeyboard();
        onView(withId(R.id.btn_continue)).perform(click());
        wait(2000);
        closeSoftKeyboard();
        onView(withId(R.id.pinView)).perform(typeText(string_pinno));
        assertNotNull(R.id.pinView);
    }
}
