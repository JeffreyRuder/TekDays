<span style="text-align: center;">
    <h1>${event}</h1>
</span>
<table>
    <tr>
        <td>
            Start Date: <g:formatDate format="dd MMMM yyyy" date="${event.startDate}"/>
        </td>
        <td>
            <g:if test="${event.endDate}">
                End Date: <g:formatDate format="dd MMMM yyyy" date="${event.endDate}"/>
            </g:if>
        </td>
    </tr>

    <tr>
        <td>
            Venue: ${event.venue}
        </td>

        <td>
            Interested TekDays Users: ${event.respondents.size()}
        </td>
    </tr>

</table>