package recipes;

import java.sql.Connection;

import recipes.dao.DbConnection;

public class ProjectsApp {

	public static void main(String[] args) {
	
		Connection conn = DbConnection.getConnection();
	}

}
