(function(e,f,b){var k={allyes_siteid:"",allyes_channedid:"",allyes_ad_width:"",allyes_ad_height:"",allyes_adspaceid:"",allyes_output:1,allyes_host_addr:"mmae.allyes.com"};b.ALLYES={_cacheOptions:[],invoke:function(g,d){b.ALLYES._cacheOptions.push({data:g,option:d});var h=b.merge(b.merge({},k),g);b.merge(e,h);var a=f.getElementById(d.target);a.innerHTML="";a.style.position="relative";a.style.display="inline";a.style.border="none";a.style.padding="0px";a.style.margin="0px";a.style.visibility="visible";a.style.overflow="hidden";var c=f.createElement("script");c.async=!1;c.src="http://1.allyes.com.cn/mediamax/MediaMax.js";c.id=b.format("allyes_mm_ad_{{allyes_siteid}}_{{allyes_channedid}}_{{allyes_adspaceid}}",h);a.appendChild(c);e.__sebCallback=function(){b.nextPush(d)}}}})(window,document,window.Sellbuyads||{});