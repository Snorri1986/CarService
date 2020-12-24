/* JavaScript service file for upload vehicle photo
from local PC on register.html */
/* version 0.2.1 */

/* function uploads photo from local PC */
function readURL(input) {
  if (input.files && input.files[0]) {
    var reader = new FileReader();
    reader.onload = function (e) {
      $('#photo')
        .attr('src', e.target.result)
        .width(150)
        .height(150);
    };
    reader.readAsDataURL(input.files[0]);
  }
}
/* ... */