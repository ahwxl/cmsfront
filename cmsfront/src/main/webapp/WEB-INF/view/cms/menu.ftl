<div id="menu">
  <ul>
    <li class="selected"><a href="${cxt}mainScreen"><img src="${cxt}static/images/home.gif" align="absmiddle">
<#if isEnglist == true>
home
<#else>
首页
</#if>
</a></li>
<@catalog_list catalogId=webCatalogId>
<#if cataloglist??>
<#list cataloglist as navcatalog>
<#if navcatalog.catalogType = "1">
<li><a href="${cxt}prodlist/${navcatalog.catalogId}.htm">${navcatalog.catalogName}</a>
<#elseif navcatalog.catalogType = "2">
<li><a href="${cxt}contentlist/${navcatalog.catalogId}.htm">${navcatalog.catalogName}</a>
<#else>
<li><a href="${cxt}prodlist/${navcatalog.catalogId}.htm">${navcatalog.catalogName}</a>
</#if>

<#if navcatalog.childrenNode??>
<ul>
<#list navcatalog.childrenNode as chdcatalog>
<#if navcatalog.catalogType == "1">
   <li><a href="${cxt}prodlist/${chdcatalog.catalogId}.htm">${chdcatalog.catalogName}</a></li>
<#elseif navcatalog.catalogType == "2">
<li><a href="${cxt}contentlist/${chdcatalog.catalogId}.htm">${chdcatalog.catalogName}</a></li>
<#else>
<li><a href="${cxt}prodlist/${chdcatalog.catalogId}.htm">${chdcatalog.catalogName}</a></li>
</#if>
</#list>
</#if>
</ul>
</li>
</#list>
</#if>
</@catalog_list>

  </ul>
</div>