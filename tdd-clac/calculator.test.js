import { calculateScore } from './calculator';

test('Diplomado: 2 puntos por unidad hasta 4', () => {
  expect(calculateScore(2, 2, 4)).toBe(4);
  expect(calculateScore(3, 2, 4)).toBe(4); 
});

test('Maestría: 8 puntos por unidad hasta 11', () => {
  expect(calculateScore(1, 8, 11)).toBe(8);
  expect(calculateScore(2, 8, 11)).toBe(11); 
});
