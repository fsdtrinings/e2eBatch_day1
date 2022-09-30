package p1;

public class Engine {

	private int engineId;
	private int power;
	private String engineType;
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engine(int engineId, int power, String engineType) {
		super();
		this.engineId = engineId;
		this.power = power;
		this.engineType = engineType;
	}
	public int getEngineId() {
		return engineId;
	}
	public void setEngineId(int engineId) {
		this.engineId = engineId;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", power=" + power + ", engineType=" + engineType + "]";
	}
	
	
}
