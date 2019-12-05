package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolsTest {

    @Test
    public void testHello() {

        KieServices ks = KieServices.Factory.get();
        KieContainer kcontainer = ks.getKieClasspathContainer();
        KieSession ksession = kcontainer.newKieSession();

        Person taro = new Person("山田太郎", 32);
        ksession.insert(taro);
        ksession.insert(new Order(taro, "ノートPC", 180000));
        ksession.insert(new Order(taro, "みかん", 90));

        Person takashi = new Person("たかし", 10);
        ksession.insert(takashi);
        ksession.insert(new Order(takashi, "スーパーマリオメーカー", 5980));

        System.out.println("=====================");
        
        int fired = ksession.fireAllRules();

        assertEquals(2, fired);

        ksession.dispose();
    }

}
