/*codigo del menu del menu principal*/



// No es necesario agregar JavaScript para que el menú funcione correctamente,
// pero este código opcional agrega una clase "active" al elemento del menú
// seleccionado para que se resalte visualmente.
var currentLocation = location.href;
var menuItem = document.querySelectorAll('a');
var menuLength = menuItem.length;
for (var i = 0; i < menuLength; i++) {
  if (menuItem[i].href === currentLocation) {
    menuItem[i].className = "active";
  }
}








