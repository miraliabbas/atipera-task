package com.atiper.atiperatask.service.impl;

import com.atiper.atiperatask.client.GithubClient;
import com.atiper.atiperatask.model.GithubRepositoryResponse;
import com.atiper.atiperatask.model.exception.NotAcceptableException;
import com.atiper.atiperatask.service.GithubService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class GithubServiceImpl implements GithubService {
    private final GithubClient githubClient;

    @Override
    public List<GithubRepositoryResponse> getRepositoriesByUserName(String username, String accept) {
        log.info("ActionLog.getRepositoriesByUserName.start username: %s",username);
        if (accept.equals("application/xml")){
            log.error("ActionLog.getRepositoriesByUserName.error username: %s",username);
            throw new NotAcceptableException("406","Accept is not acceptable");
        }

        var response = githubClient.getRepositoriesByUserName(username).stream().filter(GithubRepositoryResponse::isFork).collect(Collectors.toList());

        log.info("ActionLog.getRepositoriesByUserName.end username: %s",username);

        return response;
    }
}
