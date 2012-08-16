package com.devoxy.android.template.lib.junit;

import com.devoxy.android.template.lib.LibraryMain;
import junit.framework.Assert;

/**
 * @author Dmitriy Tarasov
 */
public class JUnitTest {

    @org.junit.Test
    public void testSomeLogic() throws Exception {
        LibraryMain lib = new LibraryMain();
        Assert.assertEquals("Text from Android Maven Template Lib", lib.getMessage());
    }
}
