/**
 * Created by Fer on 12/21/16.
 */
"use strict";
$(document).ready(function(){

    console.log("Howdy");


    //Events

    $("edit-ad").click(function(e){
        e.preventDefault();
        var id = $(this).data("data-ad-id");
        window.location("/edit?=id="+id);
    });

});