<!-- header -->
<#include "../include/header.ftl" >
<!-- header end-->
<!-- menu -->
<#include "menu.ftl" >
<!-- menu end-->

<!-- content -->

<div id="content">
<!-- <div id="trace"><a href="index-2.html">Home</a> &gt; <a href="product.html"></a> &gt; </div>-->
  <p>&nbsp;</p>
  <h1></h1>
  <p>&nbsp;</p>
  <ul id="product">

<@product_list catalogId=catalogId>
<#list productlist as product>
    <form name="thisform" id="thisform" method="post" action="productList.asp">
    <li>
      <div class="nailthumb-container thumb" style="overflow: hidden; padding: 0px; width: 290px; height: 290px;"><a href="${cxt}productdetail/${product.id}_0.htm" title="${product.productName}"><img alt="${product.productName}" src="${cxt}${product.productImageUrl}" style="position: relative; width: 442.073170731707px; height: 290px; top: 0px; left: -76.0365853658537px;" class="nailthumb-image"></a></div>
      <p><a href="${cxt}productdetail/${product.id}_0.htm">${product.productDesc}</a></p>
      
    </li>
    <input type="hidden" name="pid" value="4">
    <input type="hidden" name="TypeID" value="8">

    </form>
</#list>
</@product_list>


	  
  </ul>
  <p class="clear">&nbsp;</p>
      <!-------------------------- 分頁-------------------------->
      
     <!-------------------------- 分頁 end-------------------------->
  <p>&nbsp;</p>
  <dl class="mainBox">
    
    
  </dl>
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