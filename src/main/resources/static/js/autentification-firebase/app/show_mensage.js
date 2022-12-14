export function showMessage(message, type = "success") {
  Toastify({
    text: message,
    duration: 4000,
    destination: "",
    newWindow: true,
    close: true,
    gravity: "top", // `top` or `bottom`
    position: "left", // `left`, `center` or `right`
    stopOnFocus: true, // Prevents dismissing of toast on hover
    style: {
      background: type === "success" ? "#794afa" : "#FF3131",
    },
    // onClick: function () { } // Callback after click
  }).showToast();
}