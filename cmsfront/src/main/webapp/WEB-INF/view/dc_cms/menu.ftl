<div class="label " id="50" rel="50" titles="导航菜单" usestate="1" style="width: 774px; height: 90px; z-index: 100; left: 462px; top: 0px; position: absolute; margin-left: 0px;" dh="0">
	<ul class="navBarUlStyle navBarUlStyle50">
<@catalog_list catalogId=webCatalogId>
<#if cataloglist??>
<#list cataloglist as navcatalog>
<#if navcatalog.catalogType = "1">
<li 
<#if Request["currentCatalog"]?exists>
<#if Request["currentCatalog"]=navcatalog.catalogId>
class="m on"
<#else>
class="m"
</#if>
</#if>
><a href="${cxt}prodlist/${navcatalog.catalogId}.htm">${navcatalog.catalogName}</a>
<#elseif navcatalog.catalogType = "2">
<li 
<#if Request["currentCatalog"]?exists>
<#if Request["currentCatalog"]=navcatalog.catalogId>
class="m on"
<#else>
class="m"
</#if></#if>
><a href="${cxt}contentlist/${navcatalog.catalogId}.htm">${navcatalog.catalogName}</a>
<#else>
<li 
<#if Request["currentCatalog"]?exists>
<#if Request["currentCatalog"]=navcatalog.catalogId>
class="m on"
<#else>
class="m"
</#if></#if>
><a href="${cxt}prodlist/${navcatalog.catalogId}.htm">${navcatalog.catalogName}</a>
</#if>

</#list>
</#if>
</@catalog_list>
	</ul>
<div class="clear"></div>
</div>

