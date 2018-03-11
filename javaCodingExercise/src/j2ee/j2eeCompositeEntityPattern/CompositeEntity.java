package j2eeCompositeEntityPattern;

public class CompositeEntity {

	private CoarseGrainedObject cgo = new CoarseGrainedObject();
	
	
	public String[] getData() {
		return this.cgo.getData();
	}
	
	public void setData(String data1, String data2) {
		this.cgo.setData(data1, data2);
	}
	
}
