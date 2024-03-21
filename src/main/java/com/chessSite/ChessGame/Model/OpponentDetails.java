package com.chessSite.ChessGame.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "opponent_details")
public class OpponentDetails {

    @Id
    @Column(name = "id")
    @Getter @Setter
    private int id;

    @Column(name = "player_name")
    @Getter @Setter
    private String playerName;

    @Column(name = "player_rating")
    @Getter @Setter
    private int playerRating;

    @Column(name = "no_tournaments_played")
    @Getter @Setter
    private int noOfTournamentsPlayed;

    @Column(name = "played_with_colour")
    @Getter @Setter
    private String playedWithColour;

    @Column(name = "result")
    @Getter @Setter
    private String Result;

    @Column(name = "opponents_id")
    @Getter @Setter
    private int opponentsId;

    @Column(name = "player_chess_id")
    @Getter @Setter
    private int playerChessId;

}
