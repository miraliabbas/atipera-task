package com.atiper.atiperatask.controller;

import com.atiper.atiperatask.client.GithubClient;
import com.atiper.atiperatask.model.GithubRepositoryResponse;
import com.atiper.atiperatask.service.GithubService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/github/v1")
@RequiredArgsConstructor
public class GithubController {
    private final GithubService service;

    @GetMapping("/repos/{username}")
    public List<GithubRepositoryResponse> getRepositoriesByUserName(@PathVariable String username,
            @RequestHeader("Accept") String accept){
        return service.getRepositoriesByUserName(username, accept);
    }
}
