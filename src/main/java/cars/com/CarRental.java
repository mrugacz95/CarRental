package cars.com;

import org.apache.log4j.BasicConfigurator;

import org.apache.log4j.BasicConfigurator;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
public class CarRental {

    public static void main(String[] args) {
        try {
            KieServices ks = KieServices.Factory.get();
            //BasicConfigurator.configure();
            KieContainer kContainer = ks.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession("ksession-rules");
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
