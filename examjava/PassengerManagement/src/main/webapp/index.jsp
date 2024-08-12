<html>

<body>
	<form action="passenger" method="post">
	
		Username:
			<input type="text" name="name" required><br> <br> 
			
		Gender:
			<input type="checkbox" name="gender" value="male">
			
			<input type="checkbox" name="gender" value="female"><br> <br> 
			
		Select a Country:
		<select name="country">
			<option value="India">India</option>
			<option value="Usa">Usa</option>
		</select>
		          <br><br>
		          
			<textarea name="aboutyou" placeholder="enter about yourself" required>
			</textarea>
						<br>
						<br> 
			<input type="checkbox" name="mailinglist" value="yes">
				
				Would you like to join our mailing list? <br> <br> 
			
			<input type="submit" value="submit">

	</form>
</body>
</html>
