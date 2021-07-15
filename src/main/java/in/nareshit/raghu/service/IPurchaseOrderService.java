package in.nareshit.raghu.service;

import java.util.List;
import java.util.Map;

import in.nareshit.raghu.model.PurchaseDtl;
import in.nareshit.raghu.model.PurchaseOrder;

public interface IPurchaseOrderService {

	//screen#1
	public Integer savePurchaseOrder(PurchaseOrder po);
	public PurchaseOrder getOnePurchaseOrder(Integer id);
	public List<PurchaseOrder> getAllPurchaseOrders();
	
	//screen#2
	public Integer savePurchaseDtl(PurchaseDtl dtl);
	public List<PurchaseDtl> getPurchaseDtlsByOrderId(Integer orderId);
	public void removePurchaseDtl(Integer dtlId);
	public void updateStatus(Integer orderId,String status);
	public Integer getDtlsCountByOrderId(Integer orderId);
	
	//for Grn
	public Map<Integer,String> getPurchaseOrderIdAndCodeByStatus(String status);
	
}
