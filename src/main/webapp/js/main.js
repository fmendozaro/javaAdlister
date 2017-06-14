/**
 * Created by Fer on 12/21/16.
 */
"use strict";
$(document).ready(function(){

    //Events

    $("#edit-ad").click(function(e){
        e.preventDefault();
        var id = $(this).data("ad-id");
        window.location = "/ads/edit?id="+id;
    });

});