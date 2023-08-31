package com.atiper.atiperatask.service;

import com.atiper.atiperatask.model.GithubRepositoryResponse;

import java.util.List;

public interface GithubService {
    List<GithubRepositoryResponse> getRepositoriesByUserName(String username, String accept);
}
