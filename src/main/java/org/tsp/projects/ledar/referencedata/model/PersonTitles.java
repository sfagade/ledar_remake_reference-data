package org.tsp.projects.ledar.referencedata.model;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.*;

/**
 *
 * @author sfagade
 */
@Entity
@Table(name = "ref_person_titles")
@AttributeOverride(name = "id", column = @Column(name = "person_title_id", nullable = false, columnDefinition = "BIGINT"))
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class PersonTitles extends LedarAbstractBase implements Serializable {

    private static final long serialVersionUID = 1L;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "title_name")
    private String titleName;
    @Size(max = 30)
    @Column(name = "created_by")
    private String createdBy;


}
