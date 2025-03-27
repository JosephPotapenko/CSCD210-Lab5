let theNum = null;

function setNumber() {
    let input = document.getElementById("userNumber").value;
    theNum = parseInt(input);
    if (isNaN(theNum) || theNum < 1) {
        alert("Please enter a valid positive number.");
    } else {
        document.getElementById("output").innerText = `Current number: ${theNum}`;
    }
}

function enterNewNumber() {
    let newInput = prompt("Please enter a new positive number:");
    let newNum = parseInt(newInput);
    if (!isNaN(newNum) && newNum > 0) {
        theNum = newNum;
        document.getElementById("output").innerText = `New number set: ${theNum}`;
    } else {
        alert("Invalid input. Please enter a positive number.");
    }
}

function countDigits() {
    if (theNum === null) {
        alert("Please enter a number first.");
        return;
    }
    let copy = theNum;
    let even = 0, odd = 0, zero = 0;

    while (copy > 0) {
        let digit = copy % 10;
        if (digit === 0) zero++;
        else if (digit % 2 === 0) even++;
        else odd++;
        copy = Math.floor(copy / 10);
    }

    document.getElementById("output").innerText = 
        `${theNum} has ${odd} odd(s), ${even} even(s), and ${zero} zero(s).`;
}

function findPrimes() {
    if (theNum === null) {
        alert("Please enter a number first.");
        return;
    }
    let primes = [];
    for (let x = 2; x <= theNum; x++) {
        let isPrime = true;
        for (let y = 2; y <= Math.sqrt(x); y++) {
            if (x % y === 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) primes.push(x);
    }

    document.getElementById("output").innerText = 
        `Prime numbers up to ${theNum}: ${primes.length > 0 ? primes.join(", ") : "None"}`;
}
