package org.core.byteUtil;

import java.nio.ByteBuffer;

public class ByteUtilss {

    public byte[] longToBytes1(long x) {
	ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
	buffer.putLong(x);
	return buffer.array();
    }

    public long bytesToLong1(byte[] bytes) {
	ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
	buffer.put(bytes);
	buffer.flip();// need flip
	return buffer.getLong();
    }

    // Or wrapped in a class to avoid repeatedly creating ByteBuffers:

    private static ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);

    public static byte[] longToBytes(long x) {
	buffer.putLong(0, x);
	return buffer.array();
    }

    public static long bytesToLong(byte[] bytes) {
	buffer.put(bytes, 0, bytes.length);
	buffer.flip();// need flip
	return buffer.getLong();
    }

}
