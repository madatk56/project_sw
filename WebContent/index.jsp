<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>java sever page</title>
</head>
<body>
	<div class="container">
  <h2>Nhập thông tin đăng nhập</h2>
  <form class="form-horizontal" action="login" method="post">
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Tài khoản:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="email" name="username" placeholder="ví dụ: abcd0107">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Mật khẩu:</label>
      <div class="col-sm-10">          
        <input type="password" class="form-control" id="pwd" name="password" placeholder="Nhập mật khẩu ...">
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Đăng nhập</button>
      </div>
    </div>
  </form>
</div>
</body>
</html>