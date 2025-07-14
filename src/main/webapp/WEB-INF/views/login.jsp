<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Login - Hello App</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body class="bg-light">
  <div class="container">
    <div class="row justify-content-center align-items-center vh-100">
      <div class="col-md-5 col-lg-4">
        <div class="card shadow-sm">
          <div class="card-body p-4">
            <h3 class="card-title mb-4 text-center">Login to Your Account</h3>
            <form method="post" action="${pageContext.request.contextPath}/login">
              <div class="mb-3">
                <label for="username" class="form-label">Username</label>
                <input type="text" id="username" name="username" class="form-control" required autofocus />
              </div>
              <div class="mb-3">
                <label for="password" class="form-label">Password</label>
                <input type="password" id="password" name="password" class="form-control" required />
              </div>
              <button type="submit" class="btn btn-primary w-100">Login</button>
            </form>

            <c:if test="${param.error != null}">
              <div class="alert alert-danger mt-3" role="alert">
                Invalid username or password.
              </div>
            </c:if>

            <c:if test="${param.logout != null}">
              <div class="alert alert-success mt-3" role="alert">
                You have been logged out successfully.
              </div>
            </c:if>

            <div class="mt-3 text-center">
              <a href="${pageContext.request.contextPath}/register">Don't have an account? Register here</a>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>