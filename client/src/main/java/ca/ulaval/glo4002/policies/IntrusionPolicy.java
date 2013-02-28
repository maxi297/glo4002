package ca.ulaval.glo4002.policies;

import ca.ulaval.glo4002.communication.CommunicationUnit;
import ca.ulaval.glo4002.devices.AlarmSystem;

public class IntrusionPolicy extends Policy {

    public IntrusionPolicy(AlarmSystem alarmSystem) {
        super(alarmSystem);
        new CommunicationUnit(alarmSystem.getUserID(),
                CommunicationUnit.CommunicationType.INTRUSION);
    }
}