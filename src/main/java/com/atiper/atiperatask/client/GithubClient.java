package com.atiper.atiperatask.client;

import com.atiper.atiperatask.model.GithubRepositoryResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "github-client", url = "${client.github.url}")
public interface GithubClient {

    @GetMapping("/users/{username}/repos")
    List<GithubRepositoryResponse> getRepositoriesByUserName(@PathVariable String username);
}
