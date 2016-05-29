class Machine {
	protected String name;
	private int code;
	
	public Machine() {
		this("Arnie", 0);
		
	}
	
	public Machine(String name) {
		this(name, 0);
	}
	
	public Machine(String name, int code) {
		this.setName(name);
		this.setCode(code);
		this.name = name;
		this.code = code;
		System.out.println("Constructor3");
		System.out.println(this.name);
		System.out.println(this.code);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	
	public int getCode() {
		return this.code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public void start() {
		System.out.println("Machine started");
	}	
	
	public void stop() {
		System.out.println("Machine stopped");
	}
}