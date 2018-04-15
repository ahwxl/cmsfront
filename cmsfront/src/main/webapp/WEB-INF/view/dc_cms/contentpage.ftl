<!-- header -->
<#include "../dc_include/header.ftl" >
<!-- header end-->


<div class="fwmain" style="position:relative;height:972px;min-height:10px;position:relative;" rel="24">
 <div class="edit_putHere  tLan" rel="100" id="100" savetitle="area100" style="height: 80px; z-index: auto; top: -3px; position: absolute; background-color: rgb(28, 28, 28); left: -31.5px; width: 1263px;">
<div class="label breadcrumbNavigation" id="101" rel="101" titles="面包屑导航" usestate="1" style="width: 533px; height: 33px; z-index: 100; left: 36.5px; top: 31px; position: absolute; margin-left: 0px;">
	<div class="location_nav location_nav101" style="background-position:center center;background-repeat:no-repeat;font-size:14px;color:#ffffff;float:left;">	<img src="${cxt}resources/template/images/home.png" style="width:10px;height:10px;">		当前位置：<a style="font-size:14px;color:#ffffff;" onmouseover="" onmouseout="this.style.color='#ffffff'" href="http://www.zjzzzc.top/">网站首页</a>&gt; <a style="font-size:14px;color:#ffffff;" onmouseover="" onmouseout="this.style.color='#ffffff'" href="http://www.zjzzzc.top/555">公司简介</a>	</div></div>

</div>
<!-- content -->
<@content_detail id=id>
<div class="label advertising" id="103" rel="103" titles="文字" usestate="1" style="width:209px;height:110px;z-index:101;left:496px;top:84px;position:absolute;margin-left:0px;">
<div class="label_content advContent text103"><div style="text-align:center;">
	<span style="color:#333333;font-family:'Microsoft YaHei';font-size:32px;line-height:1.5;"><strong>${content.cntCaption}</strong></span> 
</div>
<div style="width:100px;border-bottom:2px solid #1CB9C8;margin:auto;padding:0px;margin-top:10px;">
</div>
<div style="text-align:center;">
	<span style="line-height:2.5;font-size:16px;font-family:'Times New Roman';"><span style="line-height:2.5;font-size:16px;font-family:'Times New Roman';">&nbsp;${content.cntCaption}<br>
</span></span>
</div></div>
</div>

${pagecontent}
</@>
<!-- content end -->

</div>

<!-- footer -->

<#include "../dc_include/footer.ftl">

<!-- footer end -->
</body>
</html>