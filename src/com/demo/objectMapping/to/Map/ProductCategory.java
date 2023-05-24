package com.demo.objectMapping.to.Map;

public class ProductCategory {
	
	int productId;
	String proudctName;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProudctName() {
		return proudctName;
	}
	public void setProudctName(String proudctName) {
		this.proudctName = proudctName;
	}
	public ProductCategory(int productId, String proudctName) {
		super();
		this.productId = productId;
		this.proudctName = proudctName;
	}
	@Override
	public String toString() {
		return "ProductCategory [productId=" + productId + ", proudctName=" + proudctName + "]";
	}
	
	

}
