$(function ivan(){
    var turn=0;
    var x= '<img src="images/tic_tac_toe_x.png">';
    var o= '<img src="images/tic_tac_toe_o.png">';
    $('td').on('click',function () {
        if(turn%2==0){

            if($(this).html()==""){
                $(this).html('<img src="images/tic_tac_toe_x.png">');
                turn++;
                if($('td')[0].innerHTML==x&&$('td')[1].innerHTML==x&&$('td')[2].innerHTML==x){
                    $('h1').html("X WINS!");
                    return;
                }else if($('td')[3].innerHTML==x&&$('td')[4].innerHTML==x&&$('td')[5].innerHTML==x){
                    $('h1').html("X WINS!");
                    return;
                }else if($('td')[6].innerHTML==x&&$('td')[7].innerHTML==x&&$('td')[8].innerHTML==x){
                    $('h1').html("X WINS!");
                    return;
                }else if($('td')[0].innerHTML==x&&$('td')[3].innerHTML==x&&$('td')[6].innerHTML==x){
                    $('h1').html("X WINS!");
                    return;
                }else if($('td')[1].innerHTML==x&&$('td')[4].innerHTML==x&&$('td')[7].innerHTML==x){
                    $('h1').html("X WINS!");
                    return;
                }else if($('td')[2].innerHTML==x&&$('td')[5].innerHTML==x&&$('td')[8].innerHTML==x){
                    $('h1').html("X WINS!");
                    return;
                }else if($('td')[0].innerHTML==x&&$('td')[4].innerHTML==x&&$('td')[8].innerHTML==x){
                    $('h1').html("X WINS!");
                    return;
                }else if($('td')[2].innerHTML==x&&$('td')[4].innerHTML==x&&$('td')[6].innerHTML==x){
                    $('h1').html("X WINS!");
                    return;
                }else if($('td')[0].innerHTML==o&&$('td')[1].innerHTML==o&&$('td')[2].innerHTML==o){
                    $('h1').html("O WINS!");
                    return;
                }else if($('td')[3].innerHTML==o&&$('td')[4].innerHTML==o&&$('td')[5].innerHTML==o){
                    $('h1').html("O WINS!");
                    return;
                }else if($('td')[6].innerHTML==o&&$('td')[7].innerHTML==o&&$('td')[8].innerHTML==o){
                    $('h1').html("O WINS!");
                    return;
                }else if($('td')[0].innerHTML==o&&$('td')[3].innerHTML==o&&$('td')[6].innerHTML==o){
                    $('h1').html("O WINS!");
                    return;
                }else if($('td')[1].innerHTML==o&&$('td')[4].innerHTML==o&&$('td')[7].innerHTML==o){
                    $('h1').html("O WINS!");
                    return;
                }else if($('td')[2].innerHTML==o&&$('td')[5].innerHTML==o&&$('td')[8].innerHTML==o){
                    $('h1').html("O WINS!");
                    return;
                }else if($('td')[0].innerHTML==o&&$('td')[4].innerHTML==o&&$('td')[8].innerHTML==o){
                    $('h1').html("O WINS!");
                    return;
                }else if($('td')[2].innerHTML==o&&$('td')[4].innerHTML==o&&$('td')[6].innerHTML==o){
                    $('h1').html("O WINS!");
                    return;
                }
            }
        }else{
            if($(this).html()==""){
                $(this).html('<img src="images/tic_tac_toe_o.png">');
                turn++;
                if($('td')[0].innerHTML==x&&$('td')[1].innerHTML==x&&$('td')[2].innerHTML==x){
                    $('h1').html("X WINS!");
                }else if($('td')[3].innerHTML==x&&$('td')[4].innerHTML==x&&$('td')[5].innerHTML==x){
                    $('h1').html("X WINS!");
                }else if($('td')[6].innerHTML==x&&$('td')[7].innerHTML==x&&$('td')[8].innerHTML==x){
                    $('h1').html("X WINS!");
                }else if($('td')[0].innerHTML==x&&$('td')[3].innerHTML==x&&$('td')[6].innerHTML==x){
                    $('h1').html("X WINS!");
                }else if($('td')[1].innerHTML==x&&$('td')[4].innerHTML==x&&$('td')[7].innerHTML==x){
                    $('h1').html("X WINS!");
                }else if($('td')[2].innerHTML==x&&$('td')[5].innerHTML==x&&$('td')[8].innerHTML==x){
                    $('h1').html("X WINS!");
                }else if($('td')[0].innerHTML==x&&$('td')[4].innerHTML==x&&$('td')[8].innerHTML==x){
                    $('h1').html("X WINS!");
                }else if($('td')[2].innerHTML==x&&$('td')[4].innerHTML==x&&$('td')[6].innerHTML==x){
                    $('h1').html("X WINS!");
                }else if($('td')[0].innerHTML==o&&$('td')[1].innerHTML==o&&$('td')[2].innerHTML==o){
                    $('h1').html("O WINS!");
                }else if($('td')[3].innerHTML==o&&$('td')[4].innerHTML==o&&$('td')[5].innerHTML==o){
                    $('h1').html("O WINS!");
                }else if($('td')[6].innerHTML==o&&$('td')[7].innerHTML==o&&$('td')[8].innerHTML==o){
                    $('h1').html("O WINS!");
                }else if($('td')[0].innerHTML==o&&$('td')[3].innerHTML==o&&$('td')[6].innerHTML==o){
                    $('h1').html("O WINS!");
                }else if($('td')[1].innerHTML==o&&$('td')[4].innerHTML==o&&$('td')[7].innerHTML==o){
                    $('h1').html("O WINS!");
                }else if($('td')[2].innerHTML==o&&$('td')[5].innerHTML==o&&$('td')[8].innerHTML==o){
                    $('h1').html("O WINS!");
                }else if($('td')[0].innerHTML==o&&$('td')[4].innerHTML==o&&$('td')[8].innerHTML==o){
                    $('h1').html("O WINS!");
                }else if($('td')[2].innerHTML==o&&$('td')[4].innerHTML==o&&$('td')[6].innerHTML==o){
                    $('h1').html("O WINS!");
                }
            }
        }
    });
});
$(function(){


});