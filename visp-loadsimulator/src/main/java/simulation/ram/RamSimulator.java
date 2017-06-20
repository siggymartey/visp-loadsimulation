package simulation.ram;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import simulation.LoadControlObject;

/**
 * Created by martensigwart on 17.05.17.
 */
public class RamSimulator implements IRamSimulator {

    private static final Logger log = LoggerFactory.getLogger(RamSimulator.class);

    private LoadControlObject load;
    private Integer workload;
    private SimulatedMemory memory;


    public RamSimulator(LoadControlObject load) {
        this.load = load;
        this.workload = load.getInitialWorkload();
        this.memory = new SimulatedMemory();
    }


    @Override
    public String call() throws Exception {

        long freeMemory = Runtime.getRuntime().freeMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();
        long maxMemory = Runtime.getRuntime().maxMemory();

        log.info("Max Memory: {} Total Memory: {}, Free Memory: {}",
                maxMemory/(1000*1000),
                totalMemory/(1000*1000),
                freeMemory/(1000*1000));

        while (true) {

        }
    }

    @Override
    public void allocateMemory() {

    }
}
