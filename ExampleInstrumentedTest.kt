package zwingvendor.`in`.roxfort.zwingvendor

import `in`.roxfort.zwingvendor.R
import `in`.roxfort.zwingvendor.modules.authentication.activities.EnterPinActivity
import `in`.roxfort.zwingvendor.modules.authentication.login_activity.LoginActivity
import `in`.roxfort.zwingvendor.modules.landing.LandingActivity
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.*
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@RunWith(AndroidJUnit4::class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class ExampleInstrumentedTest {
    @Rule
    var rule = ActivityTestRule(LoginActivity::class.java)
    var newrule: ActivityTestRule<EnterPinActivity> = ActivityTestRule<EnterPinActivity>(EnterPinActivity::class.java)
    var newnewrule: ActivityTestRule<LandingActivity> = ActivityTestRule<LandingActivity>(LandingActivity::class.java)
    @Before
    fun setUp() {
        Espresso.closeSoftKeyboard()
    }

    @Test
    @Throws(InterruptedException::class)
    fun userLogin() {
        Espresso.onView(ViewMatchers.withId(R.id.edt_phoneNumber)).perform(ViewActions.typeText(string_number1))
        Espresso.closeSoftKeyboard()
        Espresso.onView(ViewMatchers.withId(R.id.btn_continue)).perform(ViewActions.click())
        wait(2000)
        Espresso.closeSoftKeyboard()
        Espresso.onView(ViewMatchers.withId(R.id.pinView)).perform(ViewActions.typeText(string_pinno))
        Assert.assertNotNull(R.id.pinView)
    }

    companion object {
        private const val string_number = "2110087009"
        private const val string_number1 = "2110000009"
        private const val string_pinno = "1234"
        fun wait(ms: Int) {
            try {
                Thread.sleep(ms.toLong())
            } catch (ex: InterruptedException) {
                Thread.currentThread().interrupt()
            }
        }
    }
}