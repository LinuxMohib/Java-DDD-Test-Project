<div class="container d-flex justify-content-center align-items-center" style="min-height: 80vh;">
    <div class="card shadow-sm p-4" style="width: 100%; max-width: 500px;">
      <h3 class="mb-4 text-center">
        <i class="bi bi-plus-circle me-2"></i> Add a New Book
      </h3>
  
      <form method="post" action="/books/add" class="needs-validation" novalidate>
        <div class="mb-3">
          <label for="title" class="form-label">Title</label>
          <input type="text" class="form-control" id="title" name="title" placeholder="Enter book title" required>
          <div class="invalid-feedback">
            Please enter the book title.
          </div>
        </div>
  
        <div class="mb-3">
          <label for="author" class="form-label">Author</label>
          <input type="text" class="form-control" id="author" name="author" placeholder="Enter author name" required>
          <div class="invalid-feedback">
            Please enter the author's name.
          </div>
        </div>
  
        <div class="d-flex justify-content-between mt-4">
          <a href="/books/page" class="btn btn-outline-secondary">
            <i class="bi bi-arrow-left-circle me-2"></i> Back
          </a>
          <button type="submit" class="btn btn-primary">Add Book</button>
        </div>
      </form>
    </div>
  </div>
  
  <!-- Bootstrap Form Validation Script -->
  <script>
    (() => {
      'use strict';
      const forms = document.querySelectorAll('.needs-validation');
      Array.from(forms).forEach(form => {
        form.addEventListener('submit', event => {
          if (!form.checkValidity()) {
            event.preventDefault();
            event.stopPropagation();
          }
          form.classList.add('was-validated');
        }, false);
      });
    })();
  </script>