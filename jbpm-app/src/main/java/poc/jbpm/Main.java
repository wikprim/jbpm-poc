package poc.jbpm;

import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.process.ProcessInstance;

/**
 * TODO: comment tkuchna
 */
public class Main {
    public static void main(String[] args) {
        StatefulKnowledgeSession session = Utils.newSession();

        ProcessInstance processInstance = session.startProcess("com.sample.evaluation");
    }
}
