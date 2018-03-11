package j2eeCompositeEntityPattern;

public class CoarseGrainedObject {

	private DependentObject1 object1 = new DependentObject1();
	
	private DependentObject2 object2 = new DependentObject2();
	
	
	public String[] getData() {
		return new String[] {this.object1.getData(), this.object2.getData()};
	}
	
	public void setData(String data1, String data2) {
		this.object1.setData(data1);
		this.object2.setData(data2);
	}
	
}
