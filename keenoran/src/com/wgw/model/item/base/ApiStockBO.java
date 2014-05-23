package com.wgw.model.item.base;
/**
 * 
 * @ClassName: ApiStockBO 
 * @Description: 库存相关的实体结构
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月19日 下午4:36:03 
 *
 */
public class ApiStockBO {
	
	private int version;//版本号, version要为小写
	private String itemId;//商品ID
	private String attr;//库存属性串,如:颜色:白|尺寸:XL
	private String desc;//描述信息
	private String stockId;//商家自定义库存编码
	private int sellerUin;//卖家Uin,即店铺QQ,主号uin
	private int soldNum;//售出数量
	private int price;//库存价格,单位：分
	private int num;//库存数量
	private long skuId;//skuId,该ID作为库存发布成功后平台生成的库存唯一标识,作为后续修改库存时的主键
	private int status;//库存状态:1-仓库中,2-上架销售中,9-预删除,64-自定义时间上架,6-售完
	private String saleAttr;//销售属性串,即attr的数字化表示,参考商品库存属性工具
	private String pic;//库存图片链接,指拍拍本地图片库地址
	private String specAttr;//库存特殊属性串,参考商品库存属性工具
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getAttr() {
		return attr;
	}
	public void setAttr(String attr) {
		this.attr = attr;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	public int getSellerUin() {
		return sellerUin;
	}
	public void setSellerUin(int sellerUin) {
		this.sellerUin = sellerUin;
	}
	public int getSoldNum() {
		return soldNum;
	}
	public void setSoldNum(int soldNum) {
		this.soldNum = soldNum;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public long getSkuId() {
		return skuId;
	}
	public void setSkuId(long skuId) {
		this.skuId = skuId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getSaleAttr() {
		return saleAttr;
	}
	public void setSaleAttr(String saleAttr) {
		this.saleAttr = saleAttr;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getSpecAttr() {
		return specAttr;
	}
	public void setSpecAttr(String specAttr) {
		this.specAttr = specAttr;
	}

}
