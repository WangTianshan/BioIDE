package org.big.entity;

import javax.persistence.*;

/**
 * Created by WangTianshan on 2017/9/19.
 */
@Entity
@Table(name = "user_team", schema = "biodata", catalog = "")
@IdClass(UserTeamPK.class)
public class UserTeam {

    private String userId;
    private String teamId;

    @Basic
    @Id
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Id
    @Column(name = "team_id")
    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserTeam userTeam = (UserTeam) o;

        if (userId != null ? !userId.equals(userTeam.userId) : userTeam.userId != null) return false;
        if (teamId != null ? !teamId.equals(userTeam.teamId) : userTeam.teamId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (teamId != null ? teamId.hashCode() : 0);
        return result;
    }
}