package projects.service;

import projects.dao.ProjectDao;
import projects.entity.Project;

public class ProjectService {

	private ProjectDao projectDao = new ProjectDao(); 
	
	/*
	 * This method calls the DAO class to insert a project row.
	 * 
	 * @param project the {@link Project} object
	 * @return The project object with the newly generated primary key value
	 */
	
	public Project addProject(Project project) {
			return projectDao.insertProject(project); 
	}

}
