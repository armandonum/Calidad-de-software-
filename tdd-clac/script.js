import { calculateScore } from './calculator.js';

document.addEventListener('DOMContentLoaded', () => {
  const filas = document.querySelectorAll('tr');

  filas.forEach(fila => {
    const cantidadInput = fila.querySelector('.cantidad');
    const puntajeInput = fila.querySelector('.puntaje');

    if (cantidadInput && puntajeInput) {
      const mult = parseFloat(cantidadInput.dataset.mult);
      const max = parseFloat(cantidadInput.dataset.max);

      cantidadInput.addEventListener('input', () => {
        const cantidad = parseInt(cantidadInput.value) || 0;
        const puntaje = calculateScore(cantidad, mult, max);
        puntajeInput.value = puntaje;
        actualizarTotal();
      });
    }
  });

  function actualizarTotal() {
    const puntajes = document.querySelectorAll('.puntaje');
    const total = Array.from(puntajes).reduce((sum, input) => sum + (parseInt(input.value) || 0), 0);
    document.getElementById('total').textContent = total;
  }
});
