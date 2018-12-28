package com.laibao.microservice.repository;

import com.laibao.microservice.domain.LeaderBoardRow;
import com.laibao.microservice.domain.ScoreCard;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Handles CRUD operations with ScoreCards
 */
public interface ScoreCardRepository extends CrudRepository<ScoreCard, Long> {



    @Query("SELECT SUM(s.score) FROM com.laibao.microservice.domain.ScoreCard s WHERE s.userId = :userId GROUP BY s.userId")
    int getTotalScoreForUser(@Param("userId") final Long userId);


    /**
     * Retrieves a list of {@link LeaderBoardRow}s representing
     the Leader Board of users and their total score.
     * @return the leader board, sorted by highest score first.
     */
    @Query("SELECT NEW com.laibao.microservice.domain.LeaderBoardRow(s.userId, SUM(s.score)) FROM com.laibao.microservice.domain.ScoreCard s GROUP BY s.userId ORDER BY SUM(s.score) DESC")
    List<LeaderBoardRow> findFirst10();


    /**
     * Retrieves all the ScoreCards for a given user,
     identified by his user id.
     * @param userId the id of the user
     * @return a list containing all the ScoreCards for the
    given user, sorted by most recent.
     */
    List<ScoreCard> findByUserIdOrderByScoreTimestampDesc(final Long userId);
}
