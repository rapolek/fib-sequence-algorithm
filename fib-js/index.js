const start = Date.now();
console.time("fib")
let n = 36;

function fib(n) {
  if (n <= 1) {
    return n;
  }

  return fib(n - 1) + fib(n - 2);
}
const end = Date.now();

console.log(fib(n));
console.timeEnd("fib")