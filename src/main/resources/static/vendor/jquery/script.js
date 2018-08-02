$(document).ready(function () {
    $('#gif-favourite').click(function () {
        if ($(this).hasClass('mark favorite')) {
            $(this).removeClass('mark favorite');
            $(this).addClass('unmark favorite');
        } else {
            $('#gif-favourite').removeClass('unmark favorite');
            $(this).addClass('mark favorite');
        }
    })


    $.ajax({
        type: "GET",
        url: "http://localhost:8080/api/gif",
        data: {id: $('#details').attr('gif-id')}
    }).then(function (data) {
        // $('.greeting-id').append(data.id);
        // $('.greeting-content').append(data.content);

    });

});

