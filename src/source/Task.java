/**
 * 
 */
package source;

/**
 * @author Vinicius_B_Rosa
 *
 */
public class Task {

	private int target;
	
	private String commands;

	public Task(int target, String commands) {
		this.target = target;
		this.commands = commands;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	public String getCommands() {
		return commands;
	}

	public void setCommands(String commands) {
		this.commands = commands;
	}
}
