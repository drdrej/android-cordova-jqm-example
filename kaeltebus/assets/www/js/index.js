console.log(">>> execute index.js");

//$(document).bind('pageinit')



$('#home').live('pageinit', function(event) {
    $('#callFrankfurt').click(function() {
        alert('Hello');
    })
});


//
//// TODO: muss angepasst werden.
//var onDeviceReady=function(){
//	AppMobi.device.setRotateOrientation("portrait");
//    AppMobi.device.setAutoRotate(false);
////	webRoot=AppMobi.webRoot+"kitchensink/";
//	
//    $( '#phonenr' ).each( function() {
//    	window.alert( "OPA :::" + this.text() );
//    });
//    
////    $( '.phonenr' ).bind( "tap", function( event ) {
////    	console.log(">>> bind phone: " );
//////    	makePhoneCall( '10101010101' );
////    } );
//    
//    
//    //hide splash screen
//    AppMobi.device.hideSplashScreen();	
//    $.ui.blockPageScroll(); //block the page from scrolling at the header/footer
//};
// 
//function makePhoneCall( number ) {
//	console.log( ">>> make call ::: " + number );
//	cordova.exec(function() {
//		window.alert("ok");
//	}, function(err){
//		window.alert("err");
//	}, "Telephone", "makePhoneCall", []);
//}
//
//document.addEventListener("appMobi.device.ready", onDeviceReady,false);   
//
////// super.setIntegerProperty("splashscreen", R.drawable.splash);
////// super.loadUrl("file:///android_asset/www/index.html", 10000);
////
////function onDeviceReady() {
////	console.log("We got device ready");
////	// cordova.exec(null, null, "SplashScreen", "hide", []);
////	// Soon to be
////	navigator.splashscreen.hide();
////}