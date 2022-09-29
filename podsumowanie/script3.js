$(document).ready(function() {
    $("#uparr").click(function() {
      $("div").animate({
        marginTop: (parseInt($("div").css("marginTop")) - parseInt($("#marginTop").val())) + 'px'
      }, "slow");
    });
    
    $("#downarr").click(function() {
      $("div").animate({
        marginTop: (parseInt($("div").css("marginTop")) + parseInt($("#marginTop").val())) + 'px'
      }, "slow");
    });
    
    $("#leftarr").click(function() {
      $("div").animate({
        marginLeft: (parseInt($("div").css("marginLeft")) - parseInt($("#marginTop").val())) + 'px'
      }, "slow");
    });
    
    $("#rightarr").click(function() {
      $("div").animate({
        marginLeft: (parseInt($("div").css("marginLeft")) + parseInt($("#marginTop").val())) + 'px'
      }, "slow");
    });
  });