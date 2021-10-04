package week3assignment;

public class Employee {
	private int project;
	private String client;
	private int duration;
	public Employee(int project, String client, int duration) {
		super();
		this.project = project;
		this.client = client;
		this.duration = duration;
	}
	public int getProject() {
		return project;
	}
	public void setProject(int project) {
		this.project = project;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Employee [project=" + project + ", client=" + client + ", duration=" + duration + "]";
	}
}
	
	


