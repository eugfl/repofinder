package com.repofinder.backend.client;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.bind.annotation.PathVariable;

import com.repofinder.backend.model.RepositoryResponse;
import com.repofinder.backend.model.UserData;

@Component
public interface GithubClient {

    @GetExchange("/users/{username}")
    UserData getUser(@PathVariable String username);

    @GetExchange("/users/{username}/repos")
    List<RepositoryResponse> listRepos(@PathVariable String username);
}
