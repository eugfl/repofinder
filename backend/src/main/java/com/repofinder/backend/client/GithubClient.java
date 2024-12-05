package com.repofinder.backend.client;

import java.util.List;

import org.springframework.web.service.annotation.GetExchange;

import com.repofinder.backend.controller.RepositoryResponse;
import com.repofinder.backend.controller.UserData;

public interface GithubClient {

    @GetExchange("/users/{username}")
    public UserData getUser(String username);

    @GetExchange("/users/{username}/repos")
    public List<RepositoryResponse> listRepos(String username);
}
