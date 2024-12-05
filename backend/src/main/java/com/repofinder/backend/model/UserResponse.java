package com.repofinder.backend.model;

import java.util.List;

public record UserResponse(
                String login,
                String htmlUrl,
                List<RepositoryResponse> repositories,
                int totalRepositories) {
}
