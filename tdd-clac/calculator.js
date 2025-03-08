export function calculateScore(quantity, multiplier, max) {
  return Math.min(quantity * multiplier, max);
}
