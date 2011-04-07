package org.example.test;

import junit.framework.Assert;
import org.easymock.EasyMock;
import org.junit.Test;

public class InnerClassMockTest {

    @Test
    public void testInnerClassMocking() {
        final OuterClass.InnerClass mock = EasyMock.createNiceMock(OuterClass.InnerClass.class);
        EasyMock.expect(mock.returnTrue()).andReturn(true);
        EasyMock.replay(mock);
        mock.printSomething();
        Assert.assertTrue(mock.returnTrue());
        EasyMock.verify(mock);
    }
}
