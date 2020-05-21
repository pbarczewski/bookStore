$(document).ready(function() {
    $('.nav-item').click(function(e) { 
    $('.nav-item').remove('nav-clicked');
      $(this).addClass('nav-clicked');
   
    });
});

