package com.repofinder.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.repofinder.backend.client.GithubClient;
import com.repofinder.backend.model.RepositoryResponse;
import com.repofinder.backend.model.UserData;
import com.repofinder.backend.model.UserResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GithubService {

    private final GithubClient githubClient;

    public GithubService(GithubClient githubClient) {
        this.githubClient = githubClient;
    }

    public UserResponse getUserWithRepositories(String username) {
        try {
            UserData userData = githubClient.getUser(username);
            List<RepositoryResponse> repositories = githubClient.listRepos(username);

            if (repositories.isEmpty()) {
                throw new ResponseStatusException(HttpStatus.NO_CONTENT, "Usuário não possui repositórios públicos.");
            }

            return new UserResponse(userData.login(), userData.htmlUrl(), repositories, repositories.size());
        } catch (ResponseStatusException e) {
            throw e;
        } catch (Exception e) {
            if (e.getMessage().contains("404")) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não encontrado no GitHub.");
            } else if (e.getMessage().contains("403")) {
                throw new ResponseStatusException(HttpStatus.FORBIDDEN, "Limite de requisições excedido.");
            } else {
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Erro ao comunicar com o GitHub.");
            }
        }
    }
}
