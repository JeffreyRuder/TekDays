<h3>Sponsors</h3>
<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Website</th>
            <th>Contribution</th>
        </tr>
    </thead>
    <g:each in="${sponsorships}" var="sponsorship">
        <tr>
            <td>
                <g:link controller="sponsor" action="show" id="${sponsorship.sponsor.id}">${sponsorship.sponsor.name}</g:link>
            </td>
            <td>
                <a href="${sponsorship.sponsor.website}">${sponsorship.sponsor.website}</a>
            </td>
            <td>
                ${sponsorship.contributionType}
            </td>
        </tr>
    </g:each>
</table>