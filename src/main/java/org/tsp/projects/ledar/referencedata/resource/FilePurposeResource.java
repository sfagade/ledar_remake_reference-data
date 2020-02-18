package org.tsp.projects.ledar.referencedata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tsp.projects.ledar.referencedata.model.FilePurpose;
import org.tsp.projects.ledar.referencedata.repository.FilePurposeRepository;


import java.util.List;

@RestController
@RequestMapping("/api/filePurposeResource")
public class FilePurposeResource {

    private final FilePurposeRepository filePurposeRepos;

    @Autowired
    public FilePurposeResource(FilePurposeRepository filePurposeRepository) {
        this.filePurposeRepos = filePurposeRepository;
    }

    /**
     * This method is used to fetch all file purpose
     *
     * @return FilePurpose collection
     */
    @RequestMapping(value = "/fetchAllFilePurposes", method = RequestMethod.GET)
    public List<FilePurpose> fetchAllFilePurpose() {
        return filePurposeRepos.findAll();
    }
}
