package com.repofinder.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repofinder.backend.model.UserResponse;
import com.repofinder.backend.service.GithubService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/github")
public class GithubController {

    private final GithubService githubService;

    public GithubController(GithubService githubService) {
        this.githubService = githubService;
    }

    @GetMapping("/user/{username}")
    public ResponseEntity<UserResponse> getUserWithRepos(@PathVariable String username) {
        UserResponse userResponse = githubService.getUserWithRepositories(username);
        return ResponseEntity.ok(userResponse);
    }
}
