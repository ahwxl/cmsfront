<!-- header -->
<#include "../include/header.ftl" >
<!-- header end-->
<!-- menu -->
<#include "menu.ftl" >
<!-- menu end-->

<!-- content -->
<@content_detail id=id>
<div id="content">
  <div id="trace"><a href="">Home</a> &gt; <a href="news.html"></a> &gt;${content.cntCaption}</div>
  <p>&nbsp;</p>
  <h1>${content.cntCaption}</h1>
  <p>&nbsp;</p>
  
  

  <h2>${content.cntCaption}</h2>
  <p>&nbsp;</p>
  <p>Publisher: shanghai Techwell Machinery Co., Ltd.</p>
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