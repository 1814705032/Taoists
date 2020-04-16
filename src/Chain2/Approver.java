package Chain2;

public abstract class Approver {
	protected String name;
	protected Approver nextApprover;
	
	public Approver(String name) {
		this.name= name;
	}
	
	protected Approver setNextApprover(Approver nextApprover) {
		this.nextApprover = nextApprover;
		return this.nextApprover;
	}
	
	public abstract void approver(int amount);
}
