package com.contribute.demo.service.impl;

import com.contribute.demo.pojo.Contribution;
import com.contribute.demo.repository.ContributionRepository;
import com.contribute.demo.service.ContributionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContributionServiceImpl implements ContributionService {

    @Autowired
    ContributionRepository contributionRepository;

    @Override
    public List<Contribution> findIsDiscussed(boolean isDiscussed) {
        return contributionRepository.findContributionsByDiscussed(isDiscussed);
    }

    @Override
    public List<Contribution> findAll() {
        return contributionRepository.findAll();
    }

    @Override
    public void upload(Contribution contribution) {
        contributionRepository.save(contribution);
    }

    @Override
    public void save(Contribution contribution) {
        contributionRepository.save(contribution);
    }
}
