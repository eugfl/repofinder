package com.repofinder.backend.controller;

import java.util.List;

public record UserResponse(
        UserData user,
        List<RepositoryResponse> repositories,
        int totalRepositories) {
}
