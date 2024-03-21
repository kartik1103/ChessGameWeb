package com.chessSite.ChessGame.Dao;

import com.chessSite.ChessGame.Model.OpponentDetails;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OpponentDetailsRepo extends CrudRepository<OpponentDetails, Integer> {

    @Query(value = "Select id, player_name, player_rating, " +
            "no_tournaments_played, played_with_colour, result, " +
            "opponents_id, player_chess_id from opponent_details " +
            "where player_chess_id = :player_chess_id", nativeQuery = true)
    public List<OpponentDetails> getAllOpponentfromId(@Param("player_chess_id") int player_chess_id);

}
