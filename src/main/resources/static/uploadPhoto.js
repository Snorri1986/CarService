/* JavaScript service file for upload vehicle photo
from local PC on register.html */
/* version 0.2.2 */

/* function uploads photo from local PC */
function readURL(input) {
  if (input.files && input.files[0]) {
    var reader = new FileReader();
    reader.onload = function (e) {
      $('#photo')
        .attr('src', e.target.result)
        .width(100)
        .height(100);
    };
    reader.readAsDataURL(input.files[0]);
  }
}
/* ... */