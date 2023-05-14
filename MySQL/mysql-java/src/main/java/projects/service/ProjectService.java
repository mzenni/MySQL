package projects.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

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

	public List<Project> fetchAllProjects() {
		return projectDao.fetchAllProjects();
	}

	public Project fetchProjectById(Integer projectId) {
		return projectDao.fetchProjectById(projectId).orElseThrow(() -> new NoSuchElementException("Project with project ID = " + projectId + " does not exist.")); 
	}

}
