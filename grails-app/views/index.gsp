<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>TekDays</title>

	</head>
	<body>
		<div id="welcome">
			<br />
			<h3>Welcome to TekDays</h3>
			<p>TekDays assists individuals and communities in organizing technology conferences. TekDays brings brilliant minds with common interests and passions together for the greater good of coders everywhere!</p>
		</div>

		<g:organizerEvents/>

		<div class="homeCell">
			<h3>Find a TekEvent</h3>
			<p>See if there's a technical event in the works that strikes your fancy. If there is, you can volunteer to help or just let the organizers know you'd be interested in attending.</p>
			<span class="buttons">
				<g:link controller="tekEvent" action="index">Find a TekEvent</g:link>
			</span>
		</div>
		<div class="homeCell">
			<h3>Organize a TekEvent</h3>
			<p>It's easy to get started organizing a technical event and there may be others out there ready to get behind you to make it happen!</p>
			<span class="buttons">
				<g:link controller="tekEvent" action="create">Organize a TekEvent</g:link>
			</span>
		</div>
		<div class="homeCell">
			<h3>Sponsor a TekEvent</h3>
			<p>Sponsoring an event would be a great way to let the technology community know about your business or organization.</p>
			<span class="buttons">
				<g:link controller="sponsor" action="create">Sponsor a TekEvent</g:link>
			</span>
		</div>
	</body>
</html>
