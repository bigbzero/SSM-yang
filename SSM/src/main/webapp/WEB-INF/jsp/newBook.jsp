<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- 引入bootstrap -->
<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
<!-- 引入JQuery  bootstrap.js-->
<script src="/js/jquery-3.2.1.min.js"></script>
<script src="/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container" id="content">
		<div class="row">
			<div class="col-md-10">
				<div class="panel panel-default">
					<div class="panel-heading">
						<div class="row">
							<h1 style="text-align: center;">添加书籍信息</h1>
						</div>
					</div>
					<div class="panel-body">
						<form class="form-horizontal" role="form"
							action="/SSM/book/newBook" id="editfrom" method="post">
							<div class="form-group">
								<label for="bookName" class="col-sm-2 control-label">名称</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="bookName"
										name="name" placeholder="请输入名称" value="${book.name}"/>
								</div>
							</div>
							<div class="form-group">
								<label for="bookNum" class="col-sm-2 control-label">数量</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="bookNum"
										name="number" placeholder="请输入数量" value="${book.number}"/>
								</div>
							</div>
							<div class="form-group" style="text-align: center">
								<button class="btn btn-default" type="submit">提交</button>
								<button class="btn btn-default" type="reset">重置</button>
							</div>
						</form>
					</div>

				</div>

			</div>
		</div>
	</div>
	<div class="container" id="footer">
		<div class="row">
			<div class="col-md-12"></div>
		</div>
	</div>
</body>
</html>