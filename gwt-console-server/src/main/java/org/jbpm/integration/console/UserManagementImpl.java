package org.jbpm.integration.console;

import org.jboss.bpm.console.server.integration.UserManagement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * TODO: comment tkuchna
 */
public class UserManagementImpl implements UserManagement {
    private Logger log = LoggerFactory.getLogger(getClass());

    public List<String> getGroupsForActor(String s) {
        log.info("getGroupsForActor({})");
        return new ArrayList<String>(Arrays.asList("administrator", "user"));
    }

    public List<String> getActorsForGroup(String s) {
        log.info("getActorsForGroup({})",s);
        return new ArrayList<String>();
    }
}
