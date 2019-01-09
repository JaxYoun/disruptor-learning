package undereight;

import com.lmax.disruptor.EventFactory;

/**
 * @author: Yang
 * @date: 2019/1/9 23:14
 * @description:
 */
public class LongEventFactory implements EventFactory<LongEvent> {

    @Override
    public LongEvent newInstance() {
        return new LongEvent();
    }

}