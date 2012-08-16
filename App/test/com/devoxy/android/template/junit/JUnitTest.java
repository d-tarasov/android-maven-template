package com.devoxy.android.template.junit;

import com.devoxy.android.template.SomeAppLogic;
import junit.framework.Assert;
import org.junit.Test;

/**
 * @author Dmitriy Tarasov
 */
public class JUnitTest {

    @Test
    public void testSomeLogic() throws Exception {
        SomeAppLogic logic = new SomeAppLogic();
        Assert.assertEquals(true, logic.isTrue(true));
    }
}
