package poc.jbpm;

import org.drools.KnowledgeBase;
import org.drools.SessionConfiguration;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.impl.EnvironmentFactory;
import org.drools.io.ResourceFactory;
import org.drools.runtime.Environment;
import org.drools.runtime.StatefulKnowledgeSession;

/**
 * TODO: comment tkuchna
 */
public class Utils {
    private static KnowledgeBase knowledgeBase;
    private static SessionConfiguration configuration;

    public static KnowledgeBase getKnowledgeBase() {
        if (knowledgeBase!=null) return knowledgeBase;

        KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        //todo inicjowanie uniwersalne - change set ?
        kbuilder.add(ResourceFactory.newFileResource("jbpm-app/src/main/resources/Evaluation.bpmn"), ResourceType.BPMN2);
        knowledgeBase = kbuilder.newKnowledgeBase();
        
        return knowledgeBase;
    }

    public static StatefulKnowledgeSession newSession() {
        SessionConfiguration configuration = newConfiguration();
        Environment environment = EnvironmentFactory.newEnvironment();
        return getKnowledgeBase().newStatefulKnowledgeSession(configuration, environment);
    }

    private static SessionConfiguration newConfiguration() {
        SessionConfiguration configuration = new SessionConfiguration();

        //todo ustawienie work item handlerow
        //configuration.getWorkItemHandlers().put...;
        return configuration;
    }
}
