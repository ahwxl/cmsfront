<!-- header -->
<#include "../include/header.ftl" >
<!-- header end-->
<!-- menu -->
<#include "menu.ftl" >
<!-- menu end-->

<!-- content -->

<div id="content">
  <div id="trace"><a href="index-2.html">Home</a> &gt; <a href="news.html">NEWS</a> &gt; Come to visit our booth for ChinaPlas!!!</div>
  <p>&nbsp;</p>
  <h1>NEWS</h1>
  <p>&nbsp;</p>
  
  
<@content_detail id=id>
  <h2>${content.cntCaption}</h2>
  <p>&nbsp;</p>
  <p>Publisher: Fong Kee International Machinery Co., Ltd.</p>
  <p>Release Date: ${content.operateDate}</p>
 <p>&nbsp;</p>
  <div class="newsDetail">

${pagecontent}

<p>&nbsp;</p>

<p>&nbsp;</p>

  </div>
  <p>&nbsp;</p>
</@>

  
  
  
 


  </div>
<!-- content end -->
<!-- footer -->
<#include "../include/footer.ftl">
<!-- footer end -->
</body>
</html>