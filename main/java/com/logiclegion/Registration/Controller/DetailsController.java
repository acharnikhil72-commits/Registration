package com.logiclegion.Registration.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.logiclegion.Registration.Details;
import com.logiclegion.Registration.Service.DetailsService;

@CrossOrigin(origins = "*")
@RestController
public class DetailsController {

    private final DetailsService detailsService;

    public DetailsController(DetailsService detailsService) {
        this.detailsService = detailsService;
    }

    @PostMapping("/register")
    public Details save(@RequestBody Details details) {
        return detailsService.save(details);
    }

    @DeleteMapping("/{no}")
    public void delete(@PathVariable Long no) {
        detailsService.delete(no);
    }

}
