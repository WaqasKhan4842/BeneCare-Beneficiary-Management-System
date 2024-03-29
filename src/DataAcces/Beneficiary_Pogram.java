package DataAcces;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;  // Add this import statement
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import BusinessLogicServices.Beneficiary_Program;

public class Beneficiary_Pogram<Program> {
    public void insertBeneficiaryProgram(String name, String bGroup, Date startDate, Date endDate,
            String location, String objectives, String fundingSource, String eligibility,
            float budget, String pStatus, String email) {

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO Beneficiary_Programs (ID, PName, bGroup, start_date, end_date, location, " +
                             "Objective, Fuunding_Source, Eligibility_Criteria, Budget, pStatus, email) " +
                             "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")) {

            // Find the next available ID
            int nextId = getNextAvailableId(connection);
            System.out.print(email);

            preparedStatement.setInt(1, nextId);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, bGroup);
            preparedStatement.setDate(4, startDate);
            preparedStatement.setDate(5, endDate);
            preparedStatement.setString(6, location);
            preparedStatement.setString(7, objectives);
            preparedStatement.setString(8, fundingSource);
            preparedStatement.setString(9, eligibility);
            preparedStatement.setFloat(10, budget);
            preparedStatement.setString(11, pStatus);
            preparedStatement.setString(12, email);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private int getNextAvailableId(Connection connection) throws SQLException {
        int nextId = 100; // Assuming the first ID is 100
        try (PreparedStatement statement = connection.prepareStatement("SELECT MAX(ID) FROM Beneficiary_Programs");
             ResultSet resultSet = statement.executeQuery()) {

            if (resultSet.next()) {
                int maxId = resultSet.getInt(1);
                nextId = Math.max(nextId, maxId + 1);
            }
        }
        return nextId;
    }
    public static List<Beneficiary_Program> retrievePrograms() {
        List<Beneficiary_Program> programs = new ArrayList<>();

        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM Beneficiary_Programs " +
                         "INNER JOIN Benefactor ON Beneficiary_Programs.email = Benefactor.email "
                         + "WHERE pStatus = 'Pending'";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        Beneficiary_Program program = new Beneficiary_Program();
                        program.setID(resultSet.getInt("ID"));
                        program.setProgram_name(resultSet.getString("PName"));
                        program.setAge_group(resultSet.getString("bGroup"));
                        program.setStart(resultSet.getDate("start_date"));
                        program.setEnd(resultSet.getDate("end_date"));
                        program.setLocation(resultSet.getString("location"));
                        program.setObjective(resultSet.getString("Objective"));
                        program.setFunding_source(resultSet.getString("Fuunding_Source"));
                        program.setEligibility_criteria(resultSet.getString("ELigibility_Criteria"));
                        program.setBudget(resultSet.getFloat("Budget"));
                        program.setStatus(resultSet.getString("pStatus"));
                        program.setCompanyName(resultSet.getString("orgName"));

                        programs.add(program);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return programs;
    }
    public static List<Beneficiary_Program> retrieveProgramsapproved() {
        List<Beneficiary_Program> programs = new ArrayList<>();

        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM Beneficiary_Programs " +
                         "INNER JOIN Benefactor ON Beneficiary_Programs.email = Benefactor.email "
                         + "WHERE pStatus = 'Approved'";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        Beneficiary_Program program = new Beneficiary_Program();
                        program.setID(resultSet.getInt("ID"));
                        program.setProgram_name(resultSet.getString("PName"));
                        program.setAge_group(resultSet.getString("bGroup"));
                        program.setStart(resultSet.getDate("start_date"));
                        program.setEnd(resultSet.getDate("end_date"));
                        program.setLocation(resultSet.getString("location"));
                        program.setObjective(resultSet.getString("Objective"));
                        program.setFunding_source(resultSet.getString("Fuunding_Source"));
                        program.setEligibility_criteria(resultSet.getString("ELigibility_Criteria"));
                        program.setBudget(resultSet.getFloat("Budget"));
                        program.setStatus(resultSet.getString("pStatus"));
                        program.setCompanyName(resultSet.getString("orgName"));

                        programs.add(program);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return programs;
    }
    public static void updateProgramStatus(int programId, String newStatus) {
        // Implement logic to update the program status in the database
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE Beneficiary_Programs SET pStatus = ? WHERE ID = ?")) {

            preparedStatement.setString(1, newStatus);
            preparedStatement.setInt(2, programId);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
