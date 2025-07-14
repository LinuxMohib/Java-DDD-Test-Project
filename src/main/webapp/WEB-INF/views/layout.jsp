<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>MyApp Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css" rel="stylesheet">
    <style>
        body {
            margin: 0;
            min-height: 100vh;
            overflow-x: hidden;
        }
        .layout-container {
            display: flex;
            flex-direction: column;
            min-height: 100vh;
        }
        .topbar {
            height: 56px;
            background-color: #f8f9fa;
            padding: 10px 20px;
            border-bottom: 1px solid #dee2e6;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .main-area {
            display: flex;
            flex: 1;
        }
        .sidebar {
            width: 220px;
            background-color: #343a40;
            padding-top: 1rem;
        }
        .sidebar a {
            color: #fff;
            display: block;
            padding: 10px;
            text-decoration: none;
        }
        .sidebar a:hover {
            background-color: #495057;
        }
        .content {
            flex: 1;
            padding: 20px;
        }
    </style>
</head>
<body>
  <div class="layout-container">
    <!-- Topbar -->
    <div class="topbar">
      <div class="topbar-left">
        <a href="/dashboard" class="text-decoration-none text-dark fw-bold">MyApp Dashboard</a>
      </div>
      <a href="/logout" class="btn btn-outline-secondary btn-sm">Logout</a>
    </div>

    <!-- Sidebar + Main Content -->
    <div class="main-area">
      <div class="sidebar">
        <a href="/dashboard">Dashboard</a>
        <a href="/books/page">Books</a>
        <a href="/books/add">Add Book</a>
      </div>

      <div class="content">
        <jsp:include page="${content}" />
      </div>
    </div>
  </div>

  <!-- Bootstrap JS -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>