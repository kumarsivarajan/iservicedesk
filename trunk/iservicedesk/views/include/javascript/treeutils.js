/**
 * 将resultList的值转化为Tree
 * @param treeDiv 显示树的div区域
 * @param resultList 域列表
 * @param addLabelEvent 增加label点击事件
  **/
  /*
[{"levelId":"1","domDomainId":"root","domainId":0,"coldId":"086","name":"中国"},
 {"levelId":"2","domDomainId":0,"domainId":2,"coldId":"021","name":"上海"},
 {"levelId":"2","domDomainId":0,"domainId":57,"coldId":"010","name":"北京"},
 {"levelId":"2","domDomainId":0,"domainId":6,"coldId":"020","name":"广东"},
 {"levelId":"3","domDomainId":2,"domainId":3,"coldId":"001","name":"浦东"},
 {"levelId":"3","domDomainId":6,"domainId":8,"coldId":"002","name":"深圳"},
 {"levelId":"3","domDomainId":6,"domainId":9,"coldId":"002","name":"珠海"},
 {"levelId":"3","domDomainId":6,"domainId":7,"coldId":"001","name":"广州"},
 {"levelId":"3","domDomainId":2,"domainId":63,"coldId":"005","name":"徐汇区"},
 {"levelId":"3","domDomainId":2,"domainId":61,"coldId":"015","name":"闽行区"}]
 */
function initYUITree(treeview, jsonDataList){
//		tree = new YAHOO.widget.TreeView(treeDiv);
		var dataList = eval(jsonDataList);
		for(j=0;j<dataList.length;j++){
			var jsonObj = dataList[j];
			if(j==0){
				eval("var node_" + jsonObj.ID + " = new YAHOO.widget.TextNode(jsonObj.NAME, treeview.getRoot(), false);");
			}
			else{
				try {
					eval("var node_" + jsonObj.ID + "= new YAHOO.widget.TextNode(jsonObj.NAME,eval(node_" + jsonObj.PARENT_ID"), false);");
				}
				catch(e){
					eval("var node_" + jsonObj.ID + " = new YAHOO.widget.TextNode(jsonObj.NAME, treeview.getRoot(), false);");
				}
			}
		}
		tree.draw();
}
/*
{"ID":"1","PARENT_ID":"0","name":"中国"},
{"ID":"2","PARENT_ID":"1","name":"北京"},


*/