package com.repofinder.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.repofinder.backend.client.GithubClient;
import com.repofinder.backend.controller.RepositoryResponse;
import com.repofinder.backend.controller.UserData;
import com.repofinder.backend.controller.UserResponse;

@Service
public class GithubService {

    private final GithubClient githubClient;

    public GithubService(GithubClient githubClient) {
        this.githubClient = githubClient;
    }

    public UserResponse getUserWithRepositories(String username) {
        UserData userData = githubClient.getUser(username);
        List<RepositoryResponse> repositories = githubClient.listRepos(username);

        return new UserResponse(userData.login(), userData.htmlUrl(), repositories, repositories.size());
    }
}
