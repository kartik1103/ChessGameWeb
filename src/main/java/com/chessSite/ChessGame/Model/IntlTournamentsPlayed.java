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
@Table(name = "tournament_list")
public class IntlTournamentsPlayed {

    @Id
    @Column(name = "tournament_id")
    @Getter @Setter
    private int tournamentId;

    @Column(name = "tournament_name")
    @Getter @Setter
    private String tournamentName;

    @Column(name = "tournament_location")
    @Getter @Setter
    private String tournamentLocation;

    @Column(name = "tournament_total_matches")
    @Getter @Setter
    private int tournamentTotalMatches;

    @Column(name = "tournament_matches_won")
    @Getter @Setter
    private int tournamentMatchesWon;

    @Column(name = "tournament_matches_lost")
    @Getter @Setter
    private int tournamentMatchesLost;

    @Column(name = "tournament_matches_drawn")
    @Getter @Setter
    private int tournamentMatchesDrawn;

    @Column(name = "net_points")
    @Getter @Setter
    private int netPoints;

    @Column(name = "chess_id")
    @Getter @Setter
    private int chess_id;


}
