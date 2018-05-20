<!-- header -->
<#include "../dc_include/header.ftl" >
<!-- header end-->


<div class="fwmain" style="position:relative;height:872px;min-height:10px;">
 <div class="edit_putHere  tLan" rel="100" id="100" savetitle="area100" style="height: 80px; z-index: auto; top: -3px; position: absolute; background-color: rgb(28, 28, 28); left: -31.5px; width: 1263px;">
<div class="label breadcrumbNavigation" id="101" rel="101" titles="面包屑导航" usestate="1" style="width: 533px; height: 33px; z-index: 100; left: 36.5px; top: 31px; position: absolute; margin-left: 0px;">
	<div class="location_nav location_nav101" style="background-position:center center;background-repeat:no-repeat;font-size:14px;color:#ffffff;float:left;">	<img src="${cxt}resources/template/images/home.png" style="width:10px;height:10px;">		当前位置：<a style="font-size:14px;color:#ffffff;" onmouseover="" onmouseout="this.style.color='#ffffff'" href="http://www.zjzzzc.top/">网站首页</a>&gt; <a style="font-size:14px;color:#ffffff;" onmouseover="" onmouseout="this.style.color='#ffffff'" href="http://www.zjzzzc.top/555">${Request["currentCatalogName"]!""}</a>	</div></div>

</div>

<!-- content -->
<div class="label advertising" id="124" rel="124" titles="文字" usestate="1" style="width:209px;height:110px;z-index:103;left:496px;top:84px;position:absolute;margin-left:0px;">
<div class="label_content advContent text124"><div style="text-align:center;">
	<span style="color:#333333;font-family:'Microsoft YaHei';"><span style="font-size:32px;line-height:48px;"><b>热点资讯</b></span></span>
</div>
<div style="width:100px;border-bottom:2px solid #1CB9C8;margin:auto;padding:0px;margin-top:10px;">
</div>
<div style="text-align:center;">
	<span style="line-height:2.5;font-size:16px;font-family:'Times New Roman';">Hot News</span>
</div></div>
</div>

<div class="label clear" id="125" rel="125" titles="文章列表" usestate="1" style="width:1195px;height:864px;z-index:101;left:1px;top:206px;position:absolute;margin-left:0px;">
	<div id="allabelcontent1" class="label_content articleList125">
		<div class="item_listNew2 id125">
			<ul class="clearfix" id="articlelist125">
			
<@content_list catalogId=catalogId >
  <#list contentList as content>
    <li><h3><a href="${cxt}contentdetail/${content.id}.htm" title="${content.cntCaption}">${content.cntCaption}</a></h3><p id="summary125" class="summary">${content.cntCaption}</p><span id="datetime125">${content.operateDate}</span><a id="moreNew125" onmouseover="" onmouseout="" href="${cxt}contentdetail/${content.id}.htm" style="float:right;">更多&gt;&gt;</a></li>
  </#list>
</@content_list>
				
			<div id="pager125" class="clear holder pager125" style="text-align:center"><div name="laypage1.3" class="laypage_main laypageskin_default" id="laypage_0"><span class="laypage_curr">1</span><a href="javascript:;" data-page="2">2</a><a href="javascript:;" class="laypage_next" data-page="2">&gt;</a></div></div>
			</ul>
		</div>
	</div>
</div>

<!-- content end -->
</div>

<!-- footer -->
<#include "../dc_include/footer.ftl">
<!-- footer end -->
</body>
</html>