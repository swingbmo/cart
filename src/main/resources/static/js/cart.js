function showCatgories() 
{
     var x = document.getElementById("products-detail-id");
  //alert(x.className);
    if (x.className === "products-detail") {
        x.className += " opened";
    } else {
        x.className = "products-detail";
    }
}
function showCatgoriesBar() 
{
     var x = document.getElementById("bars-detail-id");
    if (x.className === "bars-detail") {
        x.className += " opened";
    } else {
        x.className = "bars-detail";
    }
}