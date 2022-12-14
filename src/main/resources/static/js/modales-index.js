
//show modal on load
function AbrirModal() {
    document.querySelector('.site').classList.toggle('showmodal')
}
document.querySelector('.modalclose').addEventListener('click', function () {
    document.querySelector('.site').classList.remove('showmodal')
})


function AbrirModal2() {
    document.querySelector('.site').classList.toggle('showmodal2')
}
document.querySelector('.modalclose2').addEventListener('click', function () {
    document.querySelector('.site').classList.remove('showmodal2')
})

