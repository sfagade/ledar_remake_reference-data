package org.tsp.projects.ledar.referencedata.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import org.tsp.projects.ledar.referencedata.entity.listener.RecordUpdateListener;

@Data
@MappedSuperclass
@EntityListeners(RecordUpdateListener.class)
public abstract class LedarAbstractBase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false, columnDefinition = "BIGINT")
    protected Long id;

    @Column(name = "created")
    protected LocalDateTime created;

    @Column(name = "modified")
    protected LocalDateTime modified;
}
