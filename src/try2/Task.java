/**
 * 
 */
package try2;

import java.util.ArrayList;

/**
 * @author Vinicius_B_Rosa
 *
 */
public class Task {

	private int targetId;
	
	private ArrayList<Instruction> commands;
	
	public Task(){
		targetId = 0;
		commands = new ArrayList<>();
	}
	
	public Task(int targetId, ArrayList<Instruction> inst){
		this.targetId = targetId;
		commands = inst;
	}

	public int getTargetId() {
		return targetId;
	}

	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}

	public ArrayList<Instruction> getCommands() {
		return commands;
	}
	
	public void addInstruction(String instr){
		commands.add(this.parseIntruction(instr));
	}
	
	private Instruction parseIntruction(String str){
		switch(str){
		case "L":
			return Instruction.TURN_LEFT;
		case "R":
			return Instruction.TURN_RIGHT;
		case "M":
			return Instruction.MOVE;
		}
		return null;
	}
}