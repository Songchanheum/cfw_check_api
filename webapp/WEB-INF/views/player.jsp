<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta charset="utf-8"/>
    <title>Player</title>
  </head>
  <body>
    <canvas id="player" style="background: #000;">
      Your browser sucks.
    </canvas>
  </body>
  <script src="mjpeg.js"></script>
  <script>
    var player = new MJPEG.Player("player", "http://localhost:8001");
    player.start();
  </script>
</html>