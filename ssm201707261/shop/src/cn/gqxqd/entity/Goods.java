package cn.gqxqd.entity;

public class Goods {
	private Integer id;// 商品编号
	private String title;// 商品名称
	private Integer category;// 商品分类
	private String description;// 商品描述
	private Double price;// 商品价格
	private Integer stock;// 商品库存
	private String img;// 商品图片

	public Goods(Integer id, String title, Integer category, String description, Double price, Integer stock,
			String img) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.img = img;
	}

	public Goods() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", title=" + title + ", category=" + category + ", description=" + description
				+ ", price=" + price + ", stock=" + stock + ", img=" + img + "]";
	}

}
