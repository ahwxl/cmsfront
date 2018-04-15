<!-- header -->
<#include "../include/header.ftl" >
<!-- header end-->
<!-- menu -->
<#include "menu.ftl" >
<!-- menu end-->

<!-- content -->

<div id="content">
<!--<div id="trace"><a href="index-2.html">Home</a> &gt; News &gt; Latest News</div>-->
  <p>&nbsp;</p>
  <h1>News</h1>
  <p>&nbsp;</p>
  <ul class="newsList">

<@content_list catalogId=catalogId >
<#list contentList as content>
    <li><a href="${cxt}contentdetail/${content.id}.htm"><span>${content.operateDate}</span>
      <p>${content.cntCaption}</p></a>
    </li>

</#list>
</@content_list>
	  
      </ul>
      <!-------------------------- list end-------------------------->
      <p>&nbsp;</p>
      <!-------------------------- 分頁-------------------------->
      
     <!-------------------------- 分頁 end-------------------------->
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