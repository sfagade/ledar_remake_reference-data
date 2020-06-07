package org.tsp.projects.ledar.referencedata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tsp.projects.ledar.referencedata.model.Occupation;
import org.tsp.projects.ledar.referencedata.repository.OccupationsRepository;


import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/occupationResource")
public class OccupationResource {

    private final OccupationsRepository occupationRepository;

    @Autowired
    public OccupationResource(OccupationsRepository occupationRepository) {
        this.occupationRepository = occupationRepository;
    }

    /**
     * This method is used to fetch all Occupations from the database
     *
     * @return Occupations collections
     */
    @RequestMapping(value = "/fetchAllOccupations", method = RequestMethod.GET)
    public List<Occupation> fetchAllOccupations() {
        return occupationRepository.findAll();
    }

    /**
     * This method is used to fetch a single Occupation
     *
     * @return Occupations collection
     */
    @RequestMapping(value = "/viewOccupation/{occupationId}", method = RequestMethod.GET)
    public Occupation viewOccupation(@PathVariable("occupationId") long occupationId) {
        Optional<Occupation> optionalOccupation = occupationRepository.findById(occupationId);
        return optionalOccupation.get();
    }
}
