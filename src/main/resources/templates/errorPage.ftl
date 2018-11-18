<!DOCTYEP HTML>
<html>
<#include "/libs/head.ftl">
<body>
<style>
.error {
	font-size: 1.5em;
	margin: 105px 0 20px 0;
	justify-content: center;
}
</style>
	<#include "/libs/nav.ftl">
	<#-- include "/libs/jumbo.ftl" -->
	<div class="error">
		<h2>${errorMsg}</h2>
	</div>
	<#include "/libs/foot.ftl">
</body>
</html>