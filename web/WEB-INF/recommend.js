$(document).ready(function () {
    $.ajax({
        url: "http://localhost:8080/silkRoad/recommend?type=1&user_id=101",
    	// url: "http://123.206.87.123:8080/silkRoad2/news_info",
        async: false,
        success: function (jsonData) {
        	
            for (var i = 0; i < 5; i++) {
                var t = jsonData[i];

	                var name = t.name;
	                var location = t.location;
	                var country = t.country;
	                var doc_url = t.doc_url;
	                var rankings = t.rankings;
	                var summary = t.summary; // not use
	                var u1 = '<div style="broder-style:solid; broder-color:#000;width: 100%;height: 70px;margin-top: 20px">' +
	                    '<div style="position: relative;height: 70px;float: left;margin-left: 10px;word-break: break-word">' +
	                    '<p><a href="' + doc_url + '"><strong style="font-size: 14px; color: #00adef">' + name + '</strong></a></p>' +
	                    '<p style="font-size: 12px; color: #999;"><b>Country</b>&nbsp;' + country + '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Location&nbsp;</b>' + location + '</p>' +
	                    '<p style="font-size: 12px; color: #999;"> <b>Rankings</b> </p>' +
	                    '<p style="width: 90%; height: 13px; overflow: hidden; font-size: 12px; color: #999;">' + rankings + '</p>' +
	                    '</div>' +
	                    '</div>' +
	
	                    '<hr style="width: 400px;margin-bottom: 10px; height:1px;border:none;border-top:1px dashed #CCCCCC;">';
	                $(".companylist").append(u1);            
	                break;
	                


            }
        }
    });
});