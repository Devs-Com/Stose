
//show modal on load
function AbrirModal3() {
    document.querySelector('.site').classList.toggle('showmodal3')
}
document.querySelector('.modalclose3').addEventListener('click', function () {
    document.querySelector('.site').classList.remove('showmodal3')
})

