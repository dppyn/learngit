/**
 * Created by mzf on 2018/8/7.
 */
$(function(){
    addArray();
    //console.log(arr2);
    //加载省级列表
    for(var i=0;i<arr.length;i++) {
        $('.dropProvUl').append("<li class='dropProvLi'>" + arr[i] + "</li>");
    }
    //点击选择城市时，先隐藏省级市级选择块
    $('.citySelect').on('click',function(){
        //$('.dropDown').toggle();
        $('.dropCity').css('display',"none");
        $('.dropProv').toggle();
            //点击省份时，自动选择省会城市
            $('.dropProvLi').on('click',function(){
                $('.cityName').text( arr2[$(this).index()][0]);
                $('.dropDown div').css("display","none");
            });
            //给省级列表添加mouseover事件
            $('.dropProvLi').on('mouseover',function(){
                $('.dropCity').css("display","block");
                $('.dropProvLi').css("background-color","white");
                $('.dropCityUl').empty();
                $(this).css("background-color","#f1f3f6");
                //加载城市列表
                for(var j=0;j<arr2[$(this).index()].length;j++){
                    $('.dropCityUl').append("<li class='dropCityLi'>"+arr2[$(this).index()][j]+"</li>");

                }
                //选择城市
                $('.dropCityLi').on("click", function () {
                    //console.log($(this).text());
                    $('.cityName').text($(this).text());
                    $('.dropDown div').css("display","none");
                });
            });
    });
   // console.log(arr[17]);
});
//把市级添加到arr2中对应的省级
function addArray(){
     arr=["C语言","JAVA","计算机科学","其他技术"];
     arr2=["C语言","JAVA","计算机科学","其他技术"];
    function addTo(id,iArray){
        arr2[id] = [];
        for(let i=0;i<iArray.length;i++){
            arr2[id][i]=iArray[i];
        }

    }
   addTo("0",["C语言"]);
   addTo("1",["Java基础","Core Java","多线程并发编程","Sockets和IO","设计模式和反射","JVM","JavaWeb","Java框架"]);
   addTo("2",["数据结构和算法","操作系统","数据库","计算机网络"]);
   addTo("3",["消息服务","缓存服务","负载均衡"]);
   
   // console.log(arr);
};

