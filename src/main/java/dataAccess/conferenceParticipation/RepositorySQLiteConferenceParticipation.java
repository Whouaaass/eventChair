package dataAccess.conferenceParticipation;

import dataAccess.ConnectionSqlitePool;
import domain.Conference;
import domain.ConferenceParticipation;
import domain.User;
import domain.sql.SQLConferenceParticipation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RepositorySQLiteConferenceParticipation implements IRepositoryConferenceParticipation{
    @Override
    public ConferenceParticipation createParticipation(User user, Conference conference, ConferenceParticipation.Role rol) {
        String insertStatement = "INSERT INTO UserConference(userId, conferenceId, rol) VALUES(?,?,?)";
        try (Connection conn = ConnectionSqlitePool.getConnection()) {
            PreparedStatement statement = conn.prepareStatement(insertStatement);
            statement.setInt(1, user.getUserId());
            statement.setInt(2, conference.getId());
            statement.setInt(3, rol.value());
            int updateStatus = statement.executeUpdate();
            if (updateStatus == 1) {
                return new SQLConferenceParticipation(
                        0,
                        user.getUserId(),
                        conference.getId(),
                        rol
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ConferenceParticipation> getParticipationsOf(User user) {
        List<ConferenceParticipation> participations = new ArrayList<ConferenceParticipation>();
        String selectStatement = "SELECT * FROM UserConference where userId = ?";
        try (Connection conn = ConnectionSqlitePool.getConnection()) {
            PreparedStatement statement = conn.prepareStatement(selectStatement);
            statement.setInt(1, user.getUserId());
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                participations.add(createConferenceParticipationFromRow(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return participations;
    }

    @Override
    public List<ConferenceParticipation> getParticipationsOf(Conference conference) {
        List<ConferenceParticipation> participations = new ArrayList<>();
        String selectStatement = "SELECT * FROM UserConference where conferenceId = ?";
        try (Connection conn = ConnectionSqlitePool.getConnection()) {
            PreparedStatement statement = conn.prepareStatement(selectStatement);
            statement.setInt(1, conference.getId());
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                participations.add(createConferenceParticipationFromRow(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return participations;
    }

    @Override
    public List<ConferenceParticipation> getParticipationsOf(User user, Conference conference) {
        List<ConferenceParticipation> newParticipations = new ArrayList<>();
        String selectStatement = "SELECT * FROM UserConference where userId = ? and conferenceId = ?";
        try (Connection conn = ConnectionSqlitePool.getConnection()){
            PreparedStatement pst = conn.prepareStatement(selectStatement);
            pst.setInt(1, user.getUserId());
            pst.setInt(2, conference.getId());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                newParticipations.add(createConferenceParticipationFromRow(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newParticipations;
    }

    @Override
    public boolean RemoveParticipation(User user, Conference conference, ConferenceParticipation.Role rol) {
        String deleteStatement = "DELETE FROM UserConference where userId = ? and conferenceId = ? and rol = ?";
        boolean flag = false;
        try (Connection conn = ConnectionSqlitePool.getConnection()) {
            PreparedStatement statement = conn.prepareStatement(deleteStatement);
            statement.setInt(1, user.getUserId());
            statement.setInt(2, conference.getId());
            statement.setInt(3, rol.value());
            flag = statement.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }



    private ConferenceParticipation createConferenceParticipationFromRow(ResultSet rs) throws SQLException {
        return new SQLConferenceParticipation(
                rs.getInt("id"),
                rs.getInt("userId"),
                rs.getInt("conferenceId"),
                ConferenceParticipation.Role.valueOf(rs.getInt("rol")));
    }
}
