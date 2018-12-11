package es.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DuplicateEncoderTest {
    @Test
    public void test1() {
        assertEquals("(((", DuplicateEncoder.encode("din"));
        assertEquals("()()()", DuplicateEncoder.encode("recede"));
        assertEquals(")())())", DuplicateEncoder.encode("Success"));
        assertEquals("))((", DuplicateEncoder.encode("(( @"));
        assertEquals(")()())()(()()(", DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))", DuplicateEncoder.encode("   ()(   "));
    }

    @Test
    public void test2() {
        assertEquals("(((", DuplicateEncoder.encodeUsingStreams("din"));
        assertEquals("()()()", DuplicateEncoder.encodeUsingStreams("recede"));
        assertEquals(")())())", DuplicateEncoder.encodeUsingStreams("Success"));
        assertEquals("))((", DuplicateEncoder.encodeUsingStreams("(( @"));
        assertEquals(")()())()(()()(", DuplicateEncoder.encodeUsingStreams("Prespecialized"));
        assertEquals("))))())))", DuplicateEncoder.encodeUsingStreams("   ()(   "));
    }
}
