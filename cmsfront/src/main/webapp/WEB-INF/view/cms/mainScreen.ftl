
<!-- header -->
<#include "../include/header.ftl" >
<!-- header end-->
<!-- menu -->
<#include "menu.ftl" >
<!-- menu end-->
<!-- banner -->
<div id="banner">
  <ul class="slides_container">
    <li><a href="#" id=HBA><img src="static/images/banner/first1.jpg" width="960" height="400" title="HBA Series"></a></li>
    <li><a href="#" id=HBA><img src="static/images/banner/first2.jpg" width="960" height="400" title="HBA Series"></a></li>
  </ul>
  <a href="#" class="prev"></a> <a href="#" class="next"></a>
</div>
<!-- banner end -->
<p>&nbsp;</p>
<!-- content -->
<div id="contentIndex">
<a href="#" onClick="_gaq.push(['worldwide office']);"><img src="static/images/banner/first_long.jpg"></a>
<p>&nbsp;</p>
  <!-- left -->
  <div id="left">
    <!-- indexLeft -->
    <div id="indexLeft">
      <dl class="mainBox">
        <dt>About techwellglobal</dt>
        <dd class="comp"> <img src="static/images/company_index.jpg" width="270">
          <p>&nbsp;</p>
          <span class="bold">shanghai Techwell Machinery Co., Ltd. (FKI)</span> is the largest and finest machinery manufacturer in Taiwan Plastic Extrusion Industry. Established in 1953 by founder C.C Wei and spread its business to over 100 countries.
			<p>&nbsp;</p>
          <p class="align_r">
            <input name="" type="button" class="btn" value="More" onclick="location='company.html'">
          </p>
        </dd>
      </dl>
    </div>
    <!-- indexLeft end-->
    <!-- indexRight -->
    <div id="indexRight">
      <dl class="mainBox">
        <dt>Latest News</dt>
        <dd class="Latestnews">
            <ul class="news">
		
              <li>
                <p> <a href="#">Come to visit us booth for Taipeiplas!!!</a>  <span>(2014/9/25)</span></p>
              </li>
		
              <li>
                <p> <a href="#">PE/PP Tandem Type Extrusion Lamination Machine in MALAYSIA</a>  <span>(2014/4/30)</span></p>
              </li>
		
              <li>
                <p> <a href="#">TAITRA & Reporters visit FONG KEE!</a>  <span>(2014/3/26)</span></p>
              </li>
		
              <li>
                <p> <a href="#">FKI E-catalog now online</a>  <span>(2013/10/4)</span></p>
              </li>
		
            </ul>
   
          <p>&nbsp;</p>
          <p class="align_r">
            <input name="" type="button" class="btn" value="More" onclick="location='news.html'">
          </p>
        </dd>
      </dl>
    </div>
    <!-- indexRight end-->
  </div>
  <!-- left end -->
  <!-- right -->
  <div id="right">
      <dl class="mainBox">
        <dt>Exhibition News</dt>
        <dd class="Exhibition">
            <ul class="news">
		
              <li>
                <p><a href="#">International Plastic Fair in Japan</a> <span>(2014/10/13)</span></p>
              </li>
		
              <li>
                <p><a href="#">Taipei International Plastics&Rubber Industry Show 2014</a> <span>(2014/5/30)</span></p>
              </li>
		
              <li>
                <p><a href="#">[02-05, JUNE. 2014] SMALL & MEDIUM PROJECTS FAIR 2014</a> <span>(2014/3/18)</span></p>
              </li>
		
              <li>
                <p><a href="#">[2014.April 23-26] Chinaplas 2014 in Shanghai</a> <span>(2014/3/4)</span></p>
              </li>

         </ul>
          <p>&nbsp;</p>
          <p class="align_r">
            <input name="" type="button" class="btn" value="More" onclick="location='newsExpo.html'">
          </p>
        </dd>
      </dl>
  </div>
  <!-- right end -->
  <p class="clear">&nbsp;</p>
</div>
<!-- content end -->
<!-- footer -->
<#include "../include/footer.ftl">

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