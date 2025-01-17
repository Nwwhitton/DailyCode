let form = document.getElementById("form")
let output = document.getElementById("output")

form.addEventListener("submit", function(event){
    
    let Number = parseInt(document.getElementById("UserNum").value)

    event.preventDefault()

    if (Number > 10 && (Number % 2 == 0 || Number % 3 == 0 || Number % 5 == 0 || Number % 7 == 0)) {
        alert(Number + ` is not prime`)
    } else if (Number == 1 || Number == 0) {
        alert(Number + ` is not prime`)
    } else if (Number > 3 && Number <= 10 && (Number % 2 == 0 || Number % 3 == 0)) {
        alert(Number + ` is not prime`)
    } else {
        alert(Number + ` is prime`)
    }


})
