package org.tsp.projects.ledar.referencedata.model.listener;


import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;
import org.tsp.projects.ledar.referencedata.model.LedarAbstractBase;

public class RecordUpdateListener {

    @PreUpdate
    public void setUpdateDates(LedarAbstractBase abso) {
        abso.setModified(LocalDateTime.now());
    }

    @PrePersist
    public void setCreateDates(LedarAbstractBase abs) {
        abs.setModified(LocalDateTime.now());
        abs.setCreated(LocalDateTime.now());
    }
}
