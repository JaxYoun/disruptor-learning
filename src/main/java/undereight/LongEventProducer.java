package undereight;

import com.lmax.disruptor.RingBuffer;

import java.nio.ByteBuffer;

/**
 * @author: Yang
 * @date: 2019/1/9 23:24
 * @description:
 */
public class LongEventProducer {

    private final RingBuffer<LongEvent> ringBuffer;

    public LongEventProducer(RingBuffer<LongEvent> ringBuffer) {
        this.ringBuffer = ringBuffer;
    }

    public void onData(ByteBuffer bb) {
        // Grab the next sequence
        long sequence = ringBuffer.next();
        try {
            // Get the entry in the Disruptor
            LongEvent event = ringBuffer.get(sequence);
            // for the sequence
            event.setValue(bb.getLong(0));  // Fill with data
        } finally {
            ringBuffer.publish(sequence);
        }
    }
}
