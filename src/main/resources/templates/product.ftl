<!DOCTYEP HTML>
<html>
	<#include "/libs/head.ftl">
<body>
	<#include "/libs/nav.ftl">
	<#include "/libs/jumbo.ftl">
	
	
	<div class="product-shelf">
	
		<#list products as product>  
	    <div class="product-container">
	      <img src="${product.image.main}">
	    </div>
	    </#list>  
	    
	</div>
	<#include "/libs/foot.ftl">
</body>
</html>

