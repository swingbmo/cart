<!DOCTYEP HTML>
<html>
	<#include "/libs/head.ftl">
<body>
	<#include "/libs/nav.ftl">	
		
	<div class="detail">
		<div class="photo">
			<img src="${product.image.main}">
		</div>
		<div class="info">
			<h2>${product.title}</h2>
			<div class="price">NT$${product.price}</div>
			<p>${product.desc}</p>
			<button class="btn">加入購物車</button>
		</div>
	</div>
	<style>
	.detail {
		margin: 60px auto;
		border: 1px solid gray;
		width: 600px;
		height: 400px;
	}
	.info {
		width: 50%;
		flex-direction: column;
		padding: 10px;
	}
	.price {
		color: red;
	}
	.photo {
		width: 50%;
	}
	.photo img{
		width: 100%;
	}
	.btn {
		background-color: deepskyblue;
		width: 100px;
		height: 30px;
		border: none;
	}
	
	@media screen and (max-width:640px)
	{
		.detail {
			flex-direction: column;
			width: 400px;
			height: auto;
		}
		.photo {
			height:500px;
			width: 100%;
		}
		.info {
			width: 100%;
		}
		
	}
	</style>
	    
	<#include "/libs/foot.ftl">
</body>
</html>

