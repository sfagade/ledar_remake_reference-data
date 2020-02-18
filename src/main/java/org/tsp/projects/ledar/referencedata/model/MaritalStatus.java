package org.tsp.projects.ledar.referencedata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author sfagade
 */
@Entity
@Table(name = "ref_marital_status")
@AttributeOverride(name = "id", column = @Column(name = "marital_status_id", nullable = false, columnDefinition = "BIGINT"))
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class MaritalStatus extends LedarAbstractBase implements Serializable {

    private static final long serialVersionUID = 1L;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "marital_status_name")
    private String maritalStatusName;
    @Size(max = 500)
    @Column(name = "description")
    private String description;


}
