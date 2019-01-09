package undereight;

import com.lmax.disruptor.EventHandler;

/**
 * @author: Yang
 * @date: 2019/1/9 23:15
 * @description:
 */
public class LongEventHandler implements EventHandler<LongEvent> {

    @Override
    public void onEvent(LongEvent longEvent, long l, boolean b) throws Exception {
        System.out.println("Event: " + longEvent);
    }

}