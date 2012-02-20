package org.jbpm.integration.console;

import org.jboss.bpm.console.server.integration.ManagementFactory;
import org.jboss.bpm.console.server.integration.ProcessManagement;
import org.jboss.bpm.console.server.integration.TaskManagement;
import org.jboss.bpm.console.server.integration.UserManagement;

/**
 * TODO: comment tkuchna
 */
public class ManagementFactoryImpl extends ManagementFactory{

    @Override
    public ProcessManagement createProcessManagement() {
        return new ProcessManagementImpl();
    }

    @Override
    public TaskManagement createTaskManagement() {
        return new TaskManagementImpl();
    }

    @Override
    public UserManagement createUserManagement() {
        return new UserManagementImpl();
    }
}
