package com.devoxy.android.template.robolectric;

import android.content.res.Resources;
import com.devoxy.android.template.MainActivity;
import com.devoxy.android.template.R;
import com.xtremelabs.robolectric.RobolectricTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * @author Dmitriy Tarasov
 */
@RunWith(RobolectricTestRunner.class)
public class RobolectricTest {

    @Test
    public void simpleTest() throws Exception {
        MainActivity activity = new MainActivity();
        assertNotNull(activity);

        Resources resources = activity.getResources();
        assertNotNull(resources);

        String appName = resources.getString(R.string.app_name);
        assertNotNull(appName);

        assertThat(appName, equalTo("Android Maven Template"));
    }
}
