package org.jbpm.integration.console;

import org.jboss.bpm.console.client.model.TaskRef;
import org.jboss.bpm.console.server.integration.TaskManagement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * TODO: comment tkuchna
 */
public class TaskManagementImpl implements TaskManagement {
    private Logger log = LoggerFactory.getLogger(getClass());

    public TaskRef getTaskById(long l) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void assignTask(long l, String s, String s1) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void releaseTask(long l, String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void completeTask(long l, Map map, String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void completeTask(long l, String s, Map map, String s1) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<TaskRef> getAssignedTasks(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<TaskRef> getUnassignedTasks(String s, String s1) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
