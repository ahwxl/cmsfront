<!-- header -->
<#include "../dc_include/header.ftl" >
<!-- header end-->

<!-- content -->
<div class="fwmain" style="height: 1070px; min-height: 10px; position: relative;" rel="27">
 <!-- 导航开始 -->
 <div class="edit_putHere  tLan" rel="121" id="121" savetitle="area121" style="height: 80px; z-index: auto; top: -3px; position: absolute; background-color: rgb(28, 28, 28); left: -191.5px; width: 1583px;">
<div class="label breadcrumbNavigation" id="122" rel="122" titles="面包屑导航" usestate="1" style="width: 533px; height: 33px; z-index: 100; left: 196.5px; top: 31px; position: absolute; margin-left: 0px;">
	<div class="location_nav location_nav122" style="background-position:center center;background-repeat:no-repeat;font-size:14px;color:#ffffff;float:left;">	<img src="/template/images/home.png" style="width:10px;height:10px;">		当前位置：<a style="font-size:14px;color:#ffffff;" onmouseover="" onmouseout="this.style.color='#ffffff'" href="http://www.zjzzzc.top/">网站首页</a>&gt; <a style="font-size:14px;color:#ffffff;" onmouseover="" onmouseout="this.style.color='#ffffff'" href="http://www.zjzzzc.top/557">热点资讯</a>	</div></div>

<div class="label clear sxdh123" id="123" rel="123" titles="竖形导航" usestate="1" style="width: 312px; height: auto; z-index: 100; left: 1076px; top: 0px; position: absolute; margin-left: 0px;">
<script>$('#123').css('height','auto');
</script>
	<div class="label_content verticalNav123">
	<h1 class="sxdh1"><a style="font-size:14px;font-family:SimSun;" href="/557/567">媒体报道</a></h1>
	<h1 class="sxdh1"><a style="font-size:14px;font-family:SimSun;" href="/557/568">公司新闻</a></h1>
	<h1 class="sxdh1"><a style="font-size:14px;font-family:SimSun;" href="/557/569">行业新闻</a></h1>
	</div>
	<div class="label_foot"></div>
</div>
<style type="text/css">.verticalNav123{padding-top:0px;padding-right:0px;padding-bottom:0px;padding-left:0px;}
.verticalNav123 h1,.verticalNav123 h2,.verticalNav123 li{font-weight:normal;}
.verticalNav123 h1{width:100px;height:80px;padding-top:0px;padding-right:0px;padding-bottom:0px;padding-left:0px;float:left;}
.verticalNav123 h2{width:100px;height:80px;padding-top:0px;padding-right:0px;padding-bottom:0px;padding-left:0px;margin-left:px;float:left;}
.verticalNav123 li{width:100px;height:80px;padding-top:0px;padding-right:0px;padding-bottom:0px;padding-left:0px;margin-left:px;float:left;}
.verticalNav123 h1 a{display:inline-block;width:100%;padding-left:0px;line-height:80px;color:#ffffff;text-align:center;}
.verticalNav123 h2 a{display:inline-block;width:100%;padding-left:0px;line-height:80px;color:#000;text-align:center;}
.verticalNav123 li a{display:inline-block;width:100%;padding-left:0px;line-height:80px;color:#000;text-align:center;}
.verticalNav123 .selectCheck a,.verticalNav123 h1 a:hover,.verticalNav123 h2 a:hover,.verticalNav123 li a:hover{font-weight:normal;color:#ffffff;text-align:center;}
.verticalNav123 .selectCheck,.verticalNav123 h1:hover,.verticalNav123 h2:hover,.verticalNav123 li:hover{background-color:#00b3bf;}
</style>

</div><!-- 导航结束 -->

<!-- 小标题开发 -->
<div class="label advertising" id="124" rel="124" titles="文字" usestate="1" style="width:209px;height:110px;z-index:103;left:496px;top:84px;position:absolute;margin-left:0px;">
<div class="label_content advContent text124"><div style="text-align:center;">
	<span style="color:#333333;font-family:'Microsoft YaHei';"><span style="font-size:32px;line-height:48px;"><b>热点资讯</b></span></span>
</div>
<div style="width:100px;border-bottom:2px solid #1CB9C8;margin:auto;padding:0px;margin-top:10px;">
</div>
<div style="text-align:center;">
	<span style="line-height:2.5;font-size:16px;font-family:'Times New Roman';">Hot News</span>
</div></div>
</div><!-- 小标题结束 -->
<!-- 文章列表开始 -->
<div class="label clear" id="125" rel="125" titles="文章列表" usestate="1" style="width:1195px;height:864px;z-index:101;left:1px;top:206px;position:absolute;margin-left:0px;">
	<div id="allabelcontent1" class="label_content articleList125">
		<div class="item_listNew2 id125">
			<ul class="clearfix" id="articlelist125">
				<li><h3><a href="/557/557/38" title="知识产权十大热点案件--看京东对阿里先举报后起诉">知识产权十大热点案件--看京东对阿里先举报后起诉</a></h3><p id="summary125" class="summary">2015年知识产权之争如火如荼：搜狗、百度输入法专利之争刷新我国专利诉讼索赔额纪录，互联网巨头争夺市场“蛋糕”的较量愈来愈烈；国家发改委对美国高通公司开出巨额罚单，为标准必要专利权...</p><span id="datetime125">2017-8-24</span><a id="moreNew125" onmouseover="" onmouseout="" href="/557/557/38" style="float:right;">更多&gt;&gt;</a></li>
			
<@content_list catalogId=catalogId >
<#list contentList as content>
   <li><h3><a href="${cxt}contentdetail/${content.id}.htm" title="${content.cntCaption}">${content.cntCaption}</a></h3><p id="summary125" class="summary">${content.cntCaption}</p><span id="datetime125">${content.operateDate}</span><a id="moreNew125" onmouseover="" onmouseout="" href="${cxt}contentdetail/${content.id}.htm" style="float:right;">更多&gt;&gt;</a></li>
</#list>
</@content_list>

			<div id="pager125" class="clear holder pager125" style="text-align:center"><div name="laypage1.3" class="laypage_main laypageskin_default" id="laypage_0"><span class="laypage_curr">1</span><a href="javascript:;" data-page="2">2</a><a href="javascript:;" class="laypage_next" data-page="2">&gt;</a></div></div>
			<script>			
			   $(document).ready(function(){lay_page(125,2,557,10,1)})
			</script>
			</ul>
		</div>
	</div>
<style type="text/css">
.articleList125{padding-top:0px;padding-right:0px;padding-bottom:0px;padding-left:0px;margin-top:0px;margin-right:0px;margin-bottom:0px;margin-left:0px;}
#articlelist125 li h3 a{font-size:16px;}
#articlelist125 li{float:left;width:100%;}
#datetime125,.new_left3{margin-right:5px;}
#thum125{width:100px;height:100px;}
#summary125{font-size:14px;line-height:20px !important;}
#more125{font-size:0px !important;;position:absolute;right:0;bottom:0;}
#content_box125{}
#moreNew125{font-size:0px !important;;}
</style>
	<div class="label_foot"></div>
</div><!-- 文章列表结束 -->

</div><!-- content end -->


<!-- footer -->
<#include "../dc_include/footer.ftl">
<!-- footer end -->
</body>
</html>