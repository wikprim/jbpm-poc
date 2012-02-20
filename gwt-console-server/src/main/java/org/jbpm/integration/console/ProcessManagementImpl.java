package org.jbpm.integration.console;

import org.jboss.bpm.console.client.model.ProcessDefinitionRef;
import org.jboss.bpm.console.client.model.ProcessInstanceRef;
import org.jboss.bpm.console.server.integration.ProcessManagement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO: comment tkuchna
 */
public class ProcessManagementImpl implements ProcessManagement {
    private Logger log = LoggerFactory.getLogger(getClass());
    
    public List<ProcessDefinitionRef> getProcessDefinitions() {
        log.info("getProcessDefinitions()");
        return new ArrayList<ProcessDefinitionRef>();
    }

    public ProcessDefinitionRef getProcessDefinition(String s) {
        ProcessDefinitionRef ref = new ProcessDefinitionRef();
        log.info("getProcessDefinition({})",s);
        return null;
    }

    public List<ProcessDefinitionRef> removeProcessDefinition(String s) {
        log.info("removeProcessDefinition({})", s);
        return new ArrayList<ProcessDefinitionRef>();
    }

    public List<ProcessInstanceRef> getProcessInstances(String s) {
        log.info("getProcessInstances({})", s);
        return new ArrayList<ProcessInstanceRef>(); 
    }

    public ProcessInstanceRef getProcessInstance(String s) {
        log.info("getProcessInstance({})", s);
        return null;
    }

    public ProcessInstanceRef newInstance(String s) {
        log.info("newInstance({})", s);
        return null;
    }

    public ProcessInstanceRef newInstance(String s, Map<String, Object> stringObjectMap) {
        log.info("newInstance({},{})", s, stringObjectMap);
        return null;
    }

    public Map<String, Object> getInstanceData(String s) {
        log.info("getInstanceData({})", s);
        return new HashMap<String, Object>();
    }

    public void setInstanceData(String s, Map<String, Object> stringObjectMap) {
        log.info("setInstanceData({},{})", s,stringObjectMap);
    }

    public void endInstance(String s, ProcessInstanceRef.RESULT result) {
        log.info("endInstance({},{})", s, result);
    }

    public void deleteInstance(String s) {
        log.info("deleteInstance({})", s);
    }

    public void setProcessState(String s, ProcessInstanceRef.STATE state) {
        log.info("setProcessState({},{})", s,state);
    }

    public void signalExecution(String s, String s1) {
        log.info("signalExecution({},{})", s, s1);
    }
}
