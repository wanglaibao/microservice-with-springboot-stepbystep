package com.laibao.microservice.controller;

import com.laibao.microservice.domain.GameStats;
import com.laibao.microservice.service.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class implements a REST API for the Gamification User
 Statistics service.
 */
@RestController
@RequestMapping("/stats")
public class UserStatsController {
    private final GameService gameService;
    public UserStatsController(final GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public GameStats getStatsForUser(@RequestParam("userId") final Long userId) {
        return gameService.retrieveStatsForUser(userId);
    }
}
