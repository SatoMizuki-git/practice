
public abstract class TangibleAsset extends Asset {
	String name;
	int price;
	String color;
	// コンストラクト
	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;

	}
	// メソッド

	public String getcolor() { return this.color; }


}
