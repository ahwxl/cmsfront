<!-- header -->
<#include "../include/header.ftl" >
<!-- header end-->
<!-- menu -->
<#include "menu.ftl" >
<!-- menu end-->

<!-- content -->

<div id="content" class="">
  <p>&nbsp;</p>
  <!--<div id="trace"><a href="index-2.html">Home</a> &gt; <a href="#">Products</a> &gt; <a href="productList0d87.html?no=8"></a></div>-->
  <p>&nbsp;</p>
<@product_detail catalogId = catalogId>
  <h1>${product.productName}</h1>
  <p>&nbsp;</p>
${pagecontent}

</@product_detail>
  
  
  
  
  
  <p>&nbsp;</p>
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