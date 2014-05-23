package com.wgw.model.item;

import java.util.HashMap;

import com.wgw.model.base.SysLevelParams;
import com.wgw.util.StringUtils;

/**
 * 
 * @ClassName: ItemAddParams 
 * @Description: 微购物发布商品时请求的参数结构
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月19日 下午3:53:46 
 *
 */
public class AddItemRequest extends SysLevelParams {
	
	private HashMap<String, String> paramMap = null;
	
	public AddItemRequest(){
		paramMap = super.getParamMap();
	}
	
	private long subUin;//工号的uin，如果是主号，和uin保持一致【必填】
	private int leafClassId;//子类目Id, 可通过此接口获取Id值
	private String classAttr;//类目属性:可通过查询类目属性或者属性工具获取
	private String lable;//商品标签，如有多个采用“，”隔开,目前只传一个例如：brands|品牌ID,可用于商品分类搜索
	private String upTime;//上架时间(值为时间戳),不设置或者时间小于当前时间则商品发布成功后即上架,如果大于当前时间则会到点后才上架
	private int buyLimit;//购买限制,0-表示不限购
	private short city;//所属城市,请参考省市编码
	private int num;//商品数量。这个是只针对非多库存属性的商品， 如果是多库存属性商品，以库存stockstr中的为准。
	private String price_bin;//商品销售价格 单位：分【必填】,如果有多库存时,以库存价格为准
	private short province;//所属省份,请参考省市编码
	private String stockstr;//库存信息(json数组格式),请参考库存说明
	private String defStockId;//自定义商品编码
	private String title;//商品标题【必填】
	private int sendType;//在线支付还是货到付款: 0-在线支付;16-货到付款,默认0；货到付款的商品默认也是支持在线支付，是包含关系，不是互斥关系
	private int transportType;//运费类型: 1-卖家承担运费;2-买家承担运费
	private int transporttemplateid;//普通运费模板id, 通过此接口获取id值
	private int transporttemplateidCod;//货到付款运费模板id, 通过此接口获取id值
	private String normalMailPrice;//平邮价格,单位:分
	private String emsMailPrice;//EMS价格,单位:分
	private String expressMailPrice;//快递价格,单位:分
	private String uploadPicInfo1;//商品主图1:传入图片URL,支持外网图片地址
	private String uploadPicInfo2;//商品主图2 (URL地址)
	private String uploadPicInfo3;//商品主图3 (URL地址)
	private String uploadPicInfo4;//商品主图4 (URL地址)
	private String uploadPicInfo5;//商品主图5 (URL地址)
	private String moreImg;//更多图片，中间用“\| ”隔开,尺寸大小320*300 以上
	private String desc;//商品详情描述,例如商详页展示详情信息
	private String stockAttrImgs;//库存图片;传值说明: 库存属性|url, 以;分隔多种颜色的图片 如: 颜色:白色|http://img6.paipaiimg.com/imgs-376EACEE-376EACEE0001366800000000528F19AD.0.jpg;颜色:黑色|http://img6.paipaiimg.com/imgs-376EACEE-376EACEE0001366800000000528F19AD.0.jpg
	private String marketPrice;//商品市场价 单位：分
	

	public long getSubUin() {
		return subUin;
	}
	public void setSubUin(long subUin) {
		if (StringUtils.isNumeric(subUin)) {
			paramMap.put("subUin", subUin+"");
		}
		this.subUin = subUin;
	}
	public int getLeafClassId() {
		return leafClassId;
	}
	public void setLeafClassId(int leafClassId) {
		if (StringUtils.isNumeric(leafClassId)) {
			paramMap.put("leafClassId", leafClassId+"");
		}
		this.leafClassId = leafClassId;
	}
	public String getClassAttr() {
		return classAttr;
	}
	public void setClassAttr(String classAttr) {
		if (!StringUtils.isEmpty(classAttr)) {
			paramMap.put("classAttr", classAttr);
		}
		this.classAttr = classAttr;
	}
	public String getLable() {
		return lable;
	}
	public void setLable(String lable) {
		if (!StringUtils.isEmpty(lable)) {
			paramMap.put("lable", lable);
		}
		this.lable = lable;
	}
	public String getUpTime() {
		return upTime;
	}
	public void setUpTime(String upTime) {
		if (!StringUtils.isEmpty(upTime)) {
			paramMap.put("upTime", upTime);
		}
		this.upTime = upTime;
	}
	public int getBuyLimit() {
		return buyLimit;
	}
	public void setBuyLimit(int buyLimit) {
		if (StringUtils.isNumeric(buyLimit)) {
			paramMap.put("buyLimit", buyLimit+"");
		}
		this.buyLimit = buyLimit;
	}
	public short getCity() {
		return city;
	}
	public void setCity(short city) {
		if (StringUtils.isNumeric(city)) {
			paramMap.put("city", city+"");
		}
		this.city = city;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		if (StringUtils.isNumeric(num)) {
			paramMap.put("num", num+"");
		}
		this.num = num;
	}
	public String getPrice_bin() {
		return price_bin;
	}
	public void setPrice_bin(String price_bin) {
		if (!StringUtils.isEmpty(price_bin)) {
			paramMap.put("price_bin", price_bin);
		}
		this.price_bin = price_bin;
	}
	public short getProvince() {
		return province;
	}
	public void setProvince(short province) {
		if (StringUtils.isNumeric(province)) {
			paramMap.put("province", province+"");
		}
		this.province = province;
	}
	public String getStockstr() {
		return stockstr;
	}
	public void setStockstr(String stockstr) {
		if (!StringUtils.isEmpty(stockstr)) {
			paramMap.put("stockstr", stockstr);
		}
		this.stockstr = stockstr;
	}
	public String getDefStockId() {
		return defStockId;
	}
	public void setDefStockId(String defStockId) {
		if (!StringUtils.isEmpty(defStockId)) {
			paramMap.put("defStockId", defStockId);
		}
		this.defStockId = defStockId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if (!StringUtils.isEmpty(title)) {
			paramMap.put("title", title);
		}
		this.title = title;
	}
	public int getSendType() {
		return sendType;
	}
	public void setSendType(int sendType) {
		if (StringUtils.isNumeric(sendType)) {
			paramMap.put("sendType", sendType+"");
		}
		this.sendType = sendType;
	}
	public int getTransportType() {
		return transportType;
	}
	public void setTransportType(int transportType) {
		if (StringUtils.isNumeric(transportType)) {
			paramMap.put("transportType", transportType+"");
		}
		this.transportType = transportType;
	}
	public int getTransporttemplateid() {
		return transporttemplateid;
	}
	public void setTransporttemplateid(int transporttemplateid) {
		if (StringUtils.isNumeric(transporttemplateid)) {
			paramMap.put("transporttemplateid", transporttemplateid+"");
		}
		this.transporttemplateid = transporttemplateid;
	}
	public int getTransporttemplateidCod() {
		return transporttemplateidCod;
	}
	public void setTransporttemplateidCod(int transporttemplateidCod) {
		if (StringUtils.isNumeric(transporttemplateidCod)) {
			paramMap.put("transporttemplateidCod", transporttemplateidCod+"");
		}
		this.transporttemplateidCod = transporttemplateidCod;
	}
	public String getNormalMailPrice() {
		return normalMailPrice;
	}
	public void setNormalMailPrice(String normalMailPrice) {
		if (!StringUtils.isEmpty(normalMailPrice)) {
			paramMap.put("normalMailPrice", normalMailPrice);
		}
		this.normalMailPrice = normalMailPrice;
	}
	public String getEmsMailPrice() {
		return emsMailPrice;
	}
	public void setEmsMailPrice(String emsMailPrice) {
		if (!StringUtils.isEmpty(emsMailPrice)) {
			paramMap.put("emsMailPrice", emsMailPrice);
		}
		this.emsMailPrice = emsMailPrice;
	}
	public String getExpressMailPrice() {
		return expressMailPrice;
	}
	public void setExpressMailPrice(String expressMailPrice) {
		if (!StringUtils.isEmpty(expressMailPrice)) {
			paramMap.put("expressMailPrice", expressMailPrice);
		}
		this.expressMailPrice = expressMailPrice;
	}
	public String getUploadPicInfo1() {
		return uploadPicInfo1;
	}
	public void setUploadPicInfo1(String uploadPicInfo1) {
		if (!StringUtils.isEmpty(uploadPicInfo1)) {
			paramMap.put("uploadPicInfo1", uploadPicInfo1);
		}
		this.uploadPicInfo1 = uploadPicInfo1;
	}
	public String getUploadPicInfo2() {
		return uploadPicInfo2;
	}
	public void setUploadPicInfo2(String uploadPicInfo2) {
		if (!StringUtils.isEmpty(uploadPicInfo2)) {
			paramMap.put("uploadPicInfo2", uploadPicInfo2);
		}
		this.uploadPicInfo2 = uploadPicInfo2;
	}
	public String getUploadPicInfo3() {
		return uploadPicInfo3;
	}
	public void setUploadPicInfo3(String uploadPicInfo3) {
		if (!StringUtils.isEmpty(uploadPicInfo3)) {
			paramMap.put("uploadPicInfo3", uploadPicInfo3);
		}
		this.uploadPicInfo3 = uploadPicInfo3;
	}
	public String getUploadPicInfo4() {
		return uploadPicInfo4;
	}
	public void setUploadPicInfo4(String uploadPicInfo4) {
		if (!StringUtils.isEmpty(uploadPicInfo4)) {
			paramMap.put("uploadPicInfo4", uploadPicInfo4);
		}
		this.uploadPicInfo4 = uploadPicInfo4;
	}
	public String getUploadPicInfo5() {
		return uploadPicInfo5;
	}
	public void setUploadPicInfo5(String uploadPicInfo5) {
		if (!StringUtils.isEmpty(uploadPicInfo5)) {
			paramMap.put("uploadPicInfo5", uploadPicInfo5);
		}
		this.uploadPicInfo5 = uploadPicInfo5;
	}
	public String getMoreImg() {
		return moreImg;
	}
	public void setMoreImg(String moreImg) {
		if (!StringUtils.isEmpty(moreImg)) {
			paramMap.put("moreImg", moreImg);
		}
		this.moreImg = moreImg;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		if (!StringUtils.isEmpty(desc)) {
			paramMap.put("desc", desc);
		}
		this.desc = desc;
	}
	public String getStockAttrImgs() {
		return stockAttrImgs;
	}
	public void setStockAttrImgs(String stockAttrImgs) {
		if (!StringUtils.isEmpty(stockAttrImgs)) {
			paramMap.put("stockAttrImgs", stockAttrImgs);
		}
		this.stockAttrImgs = stockAttrImgs;
	}
	public String getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(String marketPrice) {
		if (!StringUtils.isEmpty(marketPrice)) {
			paramMap.put("marketPrice", marketPrice);
		}
		this.marketPrice = marketPrice;
	}
	
	public HashMap<String, String> getParamMap() {
		return paramMap;
	}

}
