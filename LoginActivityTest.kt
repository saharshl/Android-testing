package zwingvendor.`in`.roxfort.zwingvendor

import `in`.roxfort.zwingvendor.R
import `in`.roxfort.zwingvendor.modules.authentication.login_activity.LoginActivity
import android.widget.Button
import android.widget.EditText
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

/**
 * Created by Suyash on 27 Feb 2020 at 17:02.
 */
@RunWith(RobolectricTestRunner::class) // @Config(application = android.app.Application.class, manifest="src/main/AndroidManifest.xml", sdk = 23)
// @Config(sdk = [Build.VERSION_CODES.O_MR1])
// @Config(constants = BuildConfig.class,sdk=21)
class LoginActivityTest {
    var activity: LoginActivity? = null
    var phoneno: EditText? = null
    @Before
    fun setup() {
        activity = Robolectric.buildActivity(LoginActivity::class.java)
                .create()
                .get()
    }

    @Test
    fun testLaunch() {
        val editText = activity!!.findViewById<EditText>(R.id.edt_phoneNumber)
        editText.setText("1234567890")
        val button = activity!!.findViewById<Button>(R.id.btn_continue)
        button.performClick()
        // assertSame("12312",editText.getText().toString());
    }
}