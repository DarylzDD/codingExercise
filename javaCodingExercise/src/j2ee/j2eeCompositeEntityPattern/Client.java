package j2eeCompositeEntityPattern;

public class Client {

	private CompositeEntity entity = new CompositeEntity();
	
	
	public void printData() {
		System.out.println("[begin] entity: ");
		String[] datas = this.entity.getData();
		for (String data: datas) {
			System.out.println(data);
		}
		System.out.println("[over]");
	}
	
	public void setData(String data1, String data2) {
		this.entity.setData(data1, data2);
	}
	
}
