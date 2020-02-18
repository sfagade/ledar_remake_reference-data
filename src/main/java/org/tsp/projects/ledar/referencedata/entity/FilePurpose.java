package org.tsp.projects.ledar.referencedata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 *
 * @author sfagade
 */
@Entity
@Table(name = "ref_file_purpose")
@AttributeOverride(name = "id", column = @Column(name = "file_purpose_id", nullable = false, columnDefinition = "BIGINT"))
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Data
public class FilePurpose extends LedarAbstractBase implements Serializable {

    private static final long serialVersionUID = 1L;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "purpose_name")
    private String purposeName;
    @Size(max = 500)
    @Column(name = "description")
    private String description;


}
