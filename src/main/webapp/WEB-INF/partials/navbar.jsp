<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <a class="navbar-brand" href="/ads">Featured Ads</a>
        </div>
        <ul class="nav navbar-nav navbar-right">
            <li>
                <form class="navbar-form" action="/ads" role="search">
                    <div class="input-group">
                        <input size="30" type="text" class="form-control" placeholder="Search by title or description" name="q">
                        <div class="input-group-btn">
                            <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                        </div>
                    </div>
                </form>
            </li>

            <c:if test="${sessionScope.user == null}">
                <li><a href="/register">Register</a></li>
                <li><a href="/login">Login</a></li>
            </c:if>
            <c:if test="${sessionScope.user != null}">
                <li><a href="/ads/create">Create Ad</a></li>
                <li><a href="/profile">Profile</a></li>
                <li><a href="/logout">Logout</a></li>
            </c:if>
        </ul>
    </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
