package com.logiclegion.Registration.Service;

import org.springframework.stereotype.Service;

import com.logiclegion.Registration.Details;
import com.logiclegion.Registration.Repository.DetailsRepository;

@Service
public class DetailsService {

    private final DetailsRepository detailsRepository;

    public DetailsService(DetailsRepository detailsRepository) {
        this.detailsRepository = detailsRepository;
    }

    public Details save(Details details) {
        return detailsRepository.save(details);
    }

    public void delete(Long Sl_no) {
        detailsRepository.deleteById(Sl_no);

    }

}
