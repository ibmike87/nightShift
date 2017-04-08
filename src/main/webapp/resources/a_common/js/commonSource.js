/**
 *  통합 소스 js 파일 
 */

var sources = "";
sources +=	"<script type=\"text/javascript\" src=\"resources/a_common/js/jquery-1.11.1.js\"></script>";
//sources +=	"<script type=\"text/javascript\" src=\"../../common/js/jquery.mobile-1.4.5.js\"></script>";
//sources +=	"<script type=\"text/javascript\" src=\"../../common/js/jquery.touchSwipe.js\"></script>";
//sources +=	"<script type=\"text/javascript\" src=\"../../common/js/commonFunction.js\"></script>";
//sources +=	"<script type=\"text/javascript\" src=\"../../common/js/nativeFunction.js\"></script>";
//sources +=	"<script type=\"text/javascript\" src=\"../../common/js/commonWebServerUrl.js\"></script>";
//sources +=	"<script type=\"text/javascript\" src=\"../../common/js/Render-util.js\"></script>";

//CSS
//sources +=	"<link rel=\"stylesheet\" href=\"../../common/css/jquery.mobile-1.4.5.css\">";
sources +=	"<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/a_common/css/common.css\">";

//웹폰트
sources +=	"<link rel=\"stylesheet\" href=\"resources/a_common/css/fonts.css\">";
//sources +=	"<link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/earlyaccess/nanumgothic.css\">";	
//sources +=	"<link rel=\"stylesheet\" href=\"../../common/css/fonts.css\">";

//var CurrentFileName = document.URL.substring(document.URL.lastIndexOf("/") + 1, document.URL.lastIndexOf("/") + 30);
//console.log(CurrentFileName);

var path = window.location.pathname;
console.log(path);

console.log(sources);
document.write(sources);