<!-- header -->
<#include "../include/header.ftl" >
<!-- header end-->
<!-- menu -->
<#include "menu.ftl" >
<!-- menu end-->

<!-- content -->
<@content_detail id=id>
<div id="content">
<!--<div id="trace"><a href="">Home</a> &gt; <a href="news.html"></a> &gt;${content.cntCaption}</div>-->
  <p>&nbsp;</p>
  <h1>${content.cntCaption}</h1>
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
<#if isEnglist == true>
<#include "../include/footer_en.ftl">
<#else>
<#include "../include/footer.ftl">
</#if>
<!-- footer end -->
</body>
</html>