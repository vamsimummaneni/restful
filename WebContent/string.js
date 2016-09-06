$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8086/RestFulTest1/app/printstring/travelport"
    }).then(function(data) {
       $('.display-id').append(data);
    });
});