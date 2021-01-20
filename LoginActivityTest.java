
package zwingvendor.in.roxfort.zwingvendor;

import android.widget.Button;
import android.widget.EditText;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import in.roxfort.zwingvendor.R;
import in.roxfort.zwingvendor.modules.authentication.login_activity.LoginActivity;


/**
 * Created by Suyash on 27 Feb 2020 at 17:02.
 */

@RunWith(RobolectricTestRunner.class)
// @Config(application = android.app.Application.class, manifest="src/main/AndroidManifest.xml", sdk = 23)
// @Config(sdk = [Build.VERSION_CODES.O_MR1])

// @Config(constants = BuildConfig.class,sdk=21)

public class LoginActivityTest {

    LoginActivity activity;
    EditText phoneno;

    @Before
    public void setup() {
        activity= Robolectric.buildActivity(LoginActivity.class)
                .create()
                .get();
    }

    @Test
    public void testLaunch() {
        EditText editText = activity.findViewById(R.id.edt_phoneNumber);
        editText.setText("1234567890");

        Button button = activity.findViewById(R.id.btn_continue);
        button.performClick();

// assertSame("12312",editText.getText().toString());
    }
}