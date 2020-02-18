package org.tsp.projects.ledar.referencedata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 * @author sfagade
 */
@Entity
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Table(name = "ref_geographical_boundaries")
@AttributeOverride(name = "id", column = @Column(name = "geographical_boundary_id", nullable = false, columnDefinition = "BIGINT"))
public class GeographicalBoundaries extends LedarAbstractBase implements Serializable {

    private static final long serialVersionUID = 1L;

    @Size(max = 35)
    @Column(name = "boundary_name")
    private String boundaryName;
    @Size(max = 7)
    @Column(name = "short_name_code")
    private String shortNameCode;
    @Size(max = 75)
    @Column(name = "origin_name")
    private String originName;
    @Size(max = 5)
    @Column(name = "country_calling_code")
    private String countryCallingCode;
    @Size(max = 5)
    @Column(name = "locale_code")
    private String localeCode;

    @JoinColumn(name = "boundary_parent_id", referencedColumnName = "geographical_boundary_id")
    @ManyToOne
    private GeographicalBoundaries boundaryParentId;
    @OneToMany(mappedBy = "boundaryParentId")
    private List<GeographicalBoundaries> geographicalBoundariesList;
    @JoinColumn(name = "geographical_boundary_type_id")
    @ManyToOne(optional = false)
    private GeographicalBoundaryTypes geographicalBoundaryTypeId;


}
