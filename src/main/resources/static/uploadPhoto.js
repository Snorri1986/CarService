/* JavaScript service file for upload vehicle photo
from local PC on register.html */
/* version 0.2.1 */

/* in test 22.12.2020 */
function readURL(input) {
  if (input.files && input.files[0]) {
    var reader = new FileReader();
    reader.onload = function (e) {
      $('#blah')
        .attr('src', e.target.result)
        .width(150)
        .height(200);
    };
    reader.readAsDataURL(input.files[0]);
  }
}
/* ... */