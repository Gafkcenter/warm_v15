$().ready(function(){
  $("#column3D").click(function(){
  	  $.post("../../chartAction.do?method=column3D",function(data,textStatus){
	  	 var chart = new FusionCharts("../charts/Column3D.swf", "ChartId", "600", "450", "0", "0");
         chart.setDataXML(data);
         chart.render("chartdiv");
	  });
	 
  });
  
  $("#Pie3D").click(function(){
  	  $.post("../../chartAction.do?method=pie3D",function(data,textStatus){
	  	 var chart = new FusionCharts("../charts/Pie3D.swf", "ChartId", "600", "450", "0", "0");
         //chart.setDataURL("../data/Pie3D.xml");
          chart.setDataXML(data);
		 chart.render("chartdiv");
	  });
	 
  });
  
   
  $("#Line2D").click(function(){
  	 $.post("../../chartAction.do?method=pie3D",function(data,textStatus){
	  	 var chart = new FusionCharts("../charts/Line.swf", "ChartId", "700", "450", "0", "0");
         chart.setDataURL("../data/Line2D.xml");
         //chart.setDataXML(data);
		 chart.render("chartdiv");
	 });
	 
  });
  



});

       

