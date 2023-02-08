<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<title>Insert title here</title>
</head>
<!-- CSS -->
<link rel="stylesheet" href="resources/assets/css/styles.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css">

<!-- IONICONS -->
<script src="https://unpkg.com/ionicons@5.2.3/dist/ionicons.js"></script>
<!-- chart js -->
<script
	src="https://cdn.jsdelivr.net/npm/chart.js@3.7.0/dist/chart.min.js"></script>

<%-- <%
	String sql = "select decode(colc,1,'청1',2,'청2',3,'청3',4,'청4',5,'청5') goods,"
		+ "round(sum(cold)*sum(cole)/1000000) totalsum " + "from sale2 " + "group by colc " + "order by colc";

//db 접속
Connection con = DBCon.getConnection();
PreparedStatement pstmt = con.prepareStatement(sql);
ResultSet rs = pstmt.executeQuery();
/* while(rs.next()){
	System.out.println(rs.getString("goods")+":"+rs.getString("totalsum"));
} */
//데이터 json 처리ㅣ

JSONArray arr = new JSONArray();
while (rs.next()) {
	JSONObject obj = new JSONObject();
	String goods = rs.getString("goods");
	String sum = rs.getString("totalsum");

	obj.put("goods", goods);
	obj.put("sum", sum);
	if (obj != null) {
		arr.add(obj);
	}
}
rs.close();
pstmt.close();
con.close();
%> --%>



<body id="body-pd">
    <div class="l-navbar" id="navbar">
        <nav class="nav">
            <div>
                <div class="nav__brand">
                    <ion-icon name="menu-outline" class="nav__toggle" id="nav-toggle"></ion-icon>
                    <a href="#" class="nav__logo">파트너스</a>
                </div>
                <div class="nav__list">
                    <a href="#" class="nav__link active">
                        <ion-icon name="home-outline" class="nav__icon"></ion-icon>
                        <span class="nav_name">홈으로</span>
                    </a>
                    <a href="#" class="nav__link">
                        <ion-icon name="chatbubbles-outline" class="nav__icon"></ion-icon>
                        <span class="nav_name">Messenger</span>
                    </a>

                   <div href="#" class="nav__link collapse">
                        <ion-icon name="folder-outline" class="nav__icon"></ion-icon>
                        <span class="nav_name">Projects</span>

                        <ion-icon name="chevron-down-outline" class="collapse__link"></ion-icon>

                        <ul class="collapse__menu">
                            <a href="#" class="collapse__sublink">Data</a>
                            <a href="#" class="collapse__sublink">Group</a>
                            <a href="#" class="collapse__sublink">Members</a>
                        </ul>
                    </div>
                    <a href="#chart" class="nav__link">
                        <ion-icon name="pie-chart-outline" class="nav__icon"></ion-icon>
                        <span class="nav_name">Analytics</span>
                    </a>

                  <!--   <div href="#memberchart" class="nav__link collapse"> -->
                        <ion-icon name="people-outline" class="nav__icon"></ion-icon>
                        <span class="nav_name">Team</span>

                        <ion-icon name="chevron-down-outline" class="collapse__link"></ion-icon>

                        <ul class="collapse__menu">
                            <a href="#" class="collapse__sublink">Data</a>
                            <a href="#" class="collapse__sublink">Group</a>
                            <a href="#" class="collapse__sublink">Members</a>
                        </ul>
                  <!--   </div> -->

                    <a href="#" class="nav__link">
                        <ion-icon name="settings-outline" class="nav__icon"></ion-icon>
                        <span class="nav_name">Settings</span>
                    </a>
                </div>
                <a href="#" class="nav__link">
                    <ion-icon name="log-out-outline" class="nav__icon"></ion-icon>
                    <span class="nav_name">Log out</span>
                </a>
            </div>
        </nav>
    </div>

	<h1>관리자 페이지</h1>
	
	<h3>메시지 관리</h3>

	<p id="chart">
	<h3>통계</h3>
	<div class="container">
		<div class="row">

			<div class="col-md-4">
				<canvas id="Chart1" width="400" height="400"></canvas>
			</div>
			<div class="col-md-4">
				<canvas id="Chart2" width="400" height="400"></canvas>
			</div>
		</div>
	</div>
	</p>
	
	<!-- chart 구현부분 -->
	<%-- <script type="text/javascript">
		
		const Chart1 = document.getElementById('Chart1').getContext('2d');
		const Chart2 = document.getElementById('Chart2').getContext('2d');

				
		var jArray=new Array();
		jArray='<%=arr%>';
		jArray = JSON.parse(jArray);

		const barChartTwo = new Chart(Chart1, {
			type : 'radar',
			data : {
				labels : [ jArray[0].goods, jArray[1].goods, jArray[2].goods,
						jArray[3].goods, jArray[4].goods ],
				datasets : [ {
					label : '청바지 매출액',
					data : [ jArray[0].sum, jArray[1].sum, jArray[2].sum,
							jArray[3].sum, jArray[4].sum ],
					backgroundColor : [ 'rgba(255,99,132,1.0)',
							'rgba(55,162,132,0.2)', 'rgba(255,230,132,0.2)',
							'rgba(75,99,132,1.0)', '#0000ff' ],
					borderColor : [ 'rgba(255,99,132,1.0)',
							'rgba(55,162,132,0.2)', 'rgba(255,230,132,0.2)',
							'rgba(75,99,132,1.0)', '#ffffff' ],
					borderWidth : 3,
					borderColor : 'red',
					hoverBorderWidth : 10

				} ]
			},
			option : {
				scales : {
					y : {
						beginAtZero : true
					}
				}
			}
		});

		const barChartThree = new Chart(Chart2, {
			type : 'bar',
			data : {
				labels : [ 'aa1', 'aa2', 'aa3', 'aa4', 'aa5' ],
				datasets : [ {
					label : '청바지 매출액',
					data : [ 100, 10, 10, 20, 100 ],
					backgroundColor : [ 'rgba(255,99,132,1.0)',
							'rgba(55,162,132,0.2)', 'rgba(255,230,132,0.2)',
							'rgba(75,99,132,1.0)', '#0000ff' ],
					borderColor : [ 'rgba(255,99,132,1.0)',
							'rgba(55,162,132,0.2)', 'rgba(255,230,132,0.2)',
							'rgba(75,99,132,1.0)', '#ffffff' ],
					borderWidth : 3,
					borderColor : 'red',
					hoverBorderWidth : 10

				} ]
			},
			options : {
				title : {
					display : true,
					text : '청바지매출액',
					fontSize : 20,
					fontColor : 'red'
				},
				legend : {
					display : true,
					position : 'top'
				},
				tooltips : {
					enabled : false
				},
				layout : {
					padding : {
						left : 50,
						right : 50,
						top : 50,
						bottom : 10
					}
				}
			}
		});
	</script>
 --%>
 
 <p id="memberchart">
	<h1>회원 관리 페이지</h1>
전체 회원숫자 : ${mlist.size() }
	<table width="1200" border="1">
					<tr>
						<td>회원번호</td>
						<td>회원 ID</td>
						<td>회원 PASS</td>
						<td>회원 이름</td>
						<td>회원 나이</td>
						<td>회원 성별</td>
						<td>회원 이메일</td>
						<td>회원 연락처</td>
						<td>회원 지역</td>
						<td>회원 선호메뉴</td>
						<td>회원 가입일</td>
						<td>회원 등급</td>
					</tr>
					<c:forEach items="${mlist }" var="dto">
						<tr>
							<td>${dto.memno }</td>
							<td>${dto.memid }</td>
							<td>${dto.mempass }</td>
							<td>${dto.memname }</td>
							<td>${dto.membirth }</td>
							<td>${dto.memsex }</td>
							<td>${dto.mememail }</td>
							<td>${dto.mempnum }</td>
							<td>${dto.memaddress }</td>
							<td>${dto.memlikemenu }</td>
							<td>${dto.memjoindate }</td>
							<td>${dto.memadmin }</td>
						</tr>
					</c:forEach>
					<tr>
						<td colspan="5"><a href="writeview">글쓰기</a></td>
					</tr>
				</table>
	</p>
	<!-- JS -->
	<script src="resources/assets/js/main.js"></script>


</body>
</html>