<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

	<title>搜索结果</title>

	<link rel="stylesheet" type="text/css" href="lib/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/searchresult.css">
      <style> 
    .rankingContent{ line-height:20px}
    </style> 
</head>
<body>

    <!-- S= 导航条 -->
  <nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
      <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Read & Share</a>
      </div>
      <div id="navbar" class="navbar-collapse collapse">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">我的书房</a></li>
        <li><a href="#">个人设置</a></li>
      </ul>
      <form class="navbar-form navbar-right">
        <input type="text" class="form-control" placeholder="Search">
      </form>
      </div>
    </div>
   </nav>
      <!-- E= 导航条 -->

  <br><br>

     

  <div class="ranking">

  <div class="row rankBook">
    <div class="col-md-1 rank">
      <p>1</p>
    </div>
    <div class="col-md-2">
      <img src="res/img/photo.jpg" style="width:120px; height: 200px; padding-top: 10px;">
    </div>

    <div class="col-md-9 rankingContent">
       <strong><a href="#">《基督山伯爵》</a></strong>
      <p >作者：大仲马</p>
      <p>简介：故事讲述19世纪法国皇帝拿破仑“百日王朝”时期，法老号大副爱德蒙·唐泰斯受船长委托，为拿破仑党人送了一封信，遭到两个卑鄙小人和法官的陷害，被打入黑牢。狱友法利亚神甫向他传授各种知识，并在临终前把埋于基督山岛上的一批宝藏的秘密告诉了他。唐泰斯越狱后找到了宝藏，成为巨富，从此化名基督山伯爵（水手森巴），经过精心策划，报答了恩人，惩罚了仇人。充满传奇色彩，奇特新颖，引人入胜。</p>
      <p>浏览量：14</p>
      <p>书籍拥有者：</p>
      <div class="firstp">
      <img src="res/img/firstp.jpg" style="width:20px; height: 20px; ">
      </div>
    </div>
    </div>

  <div class="row rankBook">
    <div class="col-md-1 rank">
      <p>2</p>
    </div>
    <div class="col-md-2">
      <img src="res/img/book2.jpg" style="width:120px; height: 200px; padding-top: 10px;">
    </div>

    <div class="col-md-9 rankingContent">
       <strong><a href="#">《基督山伯爵》</a></strong>
      <p >作者：大仲马</p>
      <p>简介：小说以法国波旁王朝和七月王朝两大时期为背景，描写了一个报恩复仇的故事。法老号大副唐泰斯受船长的临终嘱托，为拿破仑送了一封信，受到两个对他嫉妒的小人的陷害，被打入死牢，狱友法里亚神甫向他传授了各种知识，还在临终前把一批宝藏的秘密告诉了他。他设法越狱后找到了宝藏，成为巨富。从此他化名为基督山伯爵，经过精心策划，报答了他的恩人，惩罚了三个一心想置他于死地的仇人。
      </p>
      <p>浏览量：10</p>
      <p>书籍拥有者：</p>
      <div class="secondp">
      <img src="res/img/secondp.jpg" style="width:20px; height: 20px; ">
      </div>
    </div>
    </div>

  <div class="row rankBook">
    <div class="col-md-1 rank">
      <p>3</p>
    </div>
    <div class="col-md-2">
      <img src="res/img/book3.jpg" style="width:120px; height: 200px; padding-top: 10px;">
    </div>

    <div class="col-md-9 rankingContent">
       <strong><a href="#">《基督山伯爵》</a></strong>
      <p >作者：大仲马</p>
      <p>简介：故事讲述的是水手邓蒂斯的报恩和复仇故事。他因遭人陷害，身陷囹圄，致使女友被夺，父亲饿死。在狱中，他幸遇法利亚长老，在他的帮助下成功越狱，并获得了一大笔财富。之后，他以“基督山伯爵”的身份，巧妙地报复了仇人，报答了恩人。</p>
      <p>浏览量：8</p>
      <p>书籍拥有者：</p>
      <div class="thirdp">
      <img src="res/img/thirdp.jpg" style="width:20px; height: 20px; ">
      </div>

    </div>
    </div>   
  </div>



   <div class="ranking2">
    <div class="row rank2">
    <div class="col-md-3 rank2">
      <img src="res/img/book4.jpg" style="width:120px; height: 200px; padding-top: 10px;">
    </div>
    <div class="col-md-3">
      <img src="res/img/book5.jpg" style="width:120px; height: 200px; padding-top: 10px;">
    </div>
    <div class="col-md-3 rankingContent">
    <img src="res/img/book6.jpg" style="width:120px; height: 200px; padding-top: 10px;">
    </div>   
    </div>
    <hr>
    <footer style="padding: 30px 0;">
      <p>&copy; OOAD Team Nine 2017</p>
    </footer>

  <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
	<script type="text/javascript" src="lib/js/bootstrap.min.js"></script>
  <script type="text/javascript" src="js/searchresult"></script>
</body>
</html>