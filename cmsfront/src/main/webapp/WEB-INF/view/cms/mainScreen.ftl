<!-- header -->
<#include "../include/header.ftl" >
<!-- header end-->
<!-- menu -->
<#include "menu.ftl" >
<!-- menu end-->
<!-- banner -->
<div id="banner">
  <ul class="slides_container">
    <li><a href="#" id=HBA><img src="static/images/banner/home_roll_1.jpg" width="960" height="400" title="HBA Series"></a></li>
    <li><a href="#" id=HBA><img src="static/images/banner/home_roll_2.jpg" width="960" height="400" title="HBA Series"></a></li>
	<li><a href="#" id=HBA><img src="static/images/banner/home_roll_3.jpg" width="960" height="400" title="HBA Series"></a></li>
	<li><a href="#" id=HBA><img src="static/images/banner/home_roll_4.jpg" width="960" height="400" title="HBA Series"></a></li>
    <li><a href="#" id=HBA><img src="static/images/banner/home_roll_5.jpg" width="960" height="400" title="HBA Series"></a></li>
  </ul>
  <a href="#" class="prev"></a> <a href="#" class="next"></a>
</div>
<!-- banner end -->
<p>&nbsp;</p>
<!-- content -->
<#if isEnglist == true>
<#include "body_en.ftl" >
<#else>
<#include "body.ftl">
</#if>
<!-- content end -->
<!-- footer -->
<#if isEnglist == true>
<#include "../include/footer_en.ftl">
<#else>
<#include "../include/footer.ftl">
</#if>

<!-- footer end -->
</body>
</html>
<script>
var rand_no = Math.floor(Math.random()*2+1);//避免零
$(function(){
	$('#banner').slides({
		start:rand_no, //隨機開始
		preload: true,
		preloadImage:'static/images/loading.gif',
		play: 4000,
		pause: 1000,
		hoverPause: true,
		generatePagination: true
	});
});
</script>