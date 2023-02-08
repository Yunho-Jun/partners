
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


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

<%--  <%
	String sql = "SELECT DECODE (MEMADMIN,0,'파트너',1,'식당파트너',2,'관리자') LV, COUNT(MEMNO) SUM FROM MEMBER GROUP BY MEMADMIN";

//db 접속
Connection con = DBCon.getConnection();
PreparedStatement pstmt = con.prepareStatement(sql);
ResultSet rs = pstmt.executeQuery();
//데이터 json 처리ㅣ

JSONArray arr = new JSONArray();
while (rs.next()) {
	JSONObject obj = new JSONObject();
	String lv = rs.getString("LV");
	String sum = rs.getString("SUM");

	obj.put("lv", lv);
	obj.put("sum", sum);
	if (obj != null) {
		arr.add(obj);
	}
}
rs.close();
pstmt.close();
con.close();
%> 
 --%>


<body id="body-pd">
	<div class="l-navbar" id="navbar">
		<nav class="nav">
			<div>
				<div class="nav__brand">
					<ion-icon name="menu-outline" class="nav__toggle" id="nav-toggle"></ion-icon>
					<a href="#" class="nav__logo">파트너스</a>
				</div>
				<div class="nav__list">
					
					<a href="/partners" class="nav__link active"> 
					<ion-icon name="home-outline" class="nav__icon"> </ion-icon> 
							<span class="nav_name">홈으로</span>
					</a> 
					
					<a href="#" class="nav__link"> 
						<ion-icon name="chatbubbles-outline" class="nav__icon"></ion-icon> 
							<span class="nav_name">Messenger</span>
					</a> 
						<a href="#chart" class="nav__link"> 
						<ion-icon name="pie-chart-outline" class="nav__icon"></ion-icon> 
							<span class="nav_name">Analytics</span>
					</a>


					<a href="#memberchart" class="nav__link"> 
					<ion-icon name="people-outline" class="nav__icon"></ion-icon>
						<span class="nav_name">Team</span></a>


					<a href="#" class="nav__link"> 
					<ion-icon name="settings-outline" class="nav__icon"></ion-icon> 
					<span class="nav_name">Settings</span>
					</a>
				</div>
				<a href="#" class="nav__link"> <ion-icon name="log-out-outline"
						class="nav__icon"></ion-icon> <span class="nav_name">Log
						out</span>
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
		<div class="row">
			<div class="col-md-4">
				<canvas id="Chart3" width="400" height="400"></canvas>
			</div>
			<div class="col-md-4">
				<canvas id="Chart4" width="400" height="400"></canvas>
			</div>
		</div>
	</div>
	</p>



	<!-- chart 구현부분 -->
	<script type="text/javascript">
	
 	    const Chart1 = document.getElementById('Chart1').getContext('2d');
		const Chart2 = document.getElementById('Chart2').getContext('2d');
		const Chart3 = document.getElementById('Chart3').getContext('2d');
		const Chart4 = document.getElementById('Chart4').getContext('2d');

		
		const barChartone = new Chart(Chart1, {
			type : 'doughnut',
			data : {
				labels : [
					<c:forEach var="list" items="${clist }">
					
					'<c:out value="${list.lv}"/>',
					
					</c:forEach>
				],
				datasets : [ {
					label : 'My First Dataset',
					data : [ 	<c:forEach var="list" items="${clist }">
					
					<c:out value="${list.sum}"/>,
					
					</c:forEach> ],
					backgroundColor : [ 'rgb(255, 99, 132)',
							'rgb(54, 162, 235)', 'rgb(255, 205, 86)' ],
					hoverOffset : 4
				} ]
			},
			options : {
				scales : {
					y : {
						beginAtZero : true
					}
				}
			}
		});

		const barChartTwo = new Chart(Chart2, {
			type : 'bar',
			data : {
				labels : [ '파트너스', '윤쉐프', '여의도바람', '히든가든', '여름향기' ],
				datasets : [ {
					label : '가게 조회수',
					data : [ 1000, 510, 210, 220, 400 ],
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
					text : '가게 조회수',
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
		const barChartThree = new Chart(Chart3, {
		    type: 'doughnut',
		    data:  {
		    	  labels: [
		    		    'Red',
		    		    'Blue',
		    		    'Yellow'
		    		  ],
		    		  datasets: [{
		    		    label: 'My First Dataset',
		    		    data: [300, 50, 100],
		    		    backgroundColor: [
		    		      'rgb(255, 99, 132)',
		    		      'rgb(54, 162, 235)',
		    		      'rgb(255, 205, 86)'
		    		    ],
		    		    hoverOffset: 4
		    		  }]
		    		},
		    options: {
		      scales: {
		        y: {
		          beginAtZero: true
		        }
		      }
		    }
		  });
		const barChart4 = new Chart(Chart4, {
			type : 'bar',
			data : {
				labels : [
					<c:forEach var="list" items="${clist }">
					
					'<c:out value="${list.lv}"/>',
					
					</c:forEach>
				],
				datasets : [ {
					label : 'My First Dataset',
					data : [ 	<c:forEach var="list" items="${clist }">
					
					<c:out value="${list.sum}"/>,
					
					</c:forEach> ],
					backgroundColor : [ 'rgb(255, 99, 132)',
							'rgb(54, 162, 235)', 'rgb(255, 205, 86)' ],
					hoverOffset : 4
				} ]
			},
			options : {
				scales : {
					y : {
						beginAtZero : true
					}
				}
			}
		});

	</script>

	<br />
	<hr />


	<div
		style="overflow-x: hidden; width: 80%; height: 500px; margin-left: 150px">
		<p id="memberchart">
		<form action="admin#memberchart" method="post">
			<div class="search">
				<select class="search-select" name="searchType">
					<option value="MEMID" name="MEMID">아이디 검색</option>
					<option value="MEMNAME" name="MEMNAME">이름 검색</option>
				</select> <input type="text" class="search-input" name="searchName" />
				<button type="submit" class="btn search-bnt">검색</button>
			</div>
		</form>


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
					<td><a href="memberview?bid=${dto.memno }">${dto.memno }</a></td>
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
		</table>
		</p>
	</div>





	<footer>
		<hr />
		<div id="copy" style="text-align: center">
			All contents Copyright 2011 ShopWeb Inc. all rights reserved<br>
			Contact mail : master@shoptech.com Tel: +82 64 123 4315 Fax +82 64
			123 4321
		</div>
		<div id="social" style="text-align: center">
			<img src="images/facebook.gif" width="33" height="33" alt="facebook">
			<img src="images/twitter.gif" width="34" height="33" alt="twitter">
		</div>
	</footer>

	<!-- JS -->
	<script src="resources/assets/js/main.js"></script>


</body>
</html>