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
@Table(name = "friends_list")
public class FriendsList {

    @Id
    @Column(name = "chess_id")
    @Getter @Setter
    private int chessId;

    @Column(name = "player_name")
    @Getter @Setter
    private String playerName;

    @Column(name = "player_rating")
    @Getter @Setter
    private int playerRating;

    @Column(name = "no_tournaments_played")
    @Getter @Setter
    private int noOfTournamentsPlayed;

    @Column(name = "friend_id")
    @Getter @Setter
    private int friendId;

}
