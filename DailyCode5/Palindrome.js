let form = document.getElementById("form")
let output = document.getElementById("output")


form.addEventListener("submit", function(event){
    
    let Word = document.getElementById("Word").value

    event.preventDefault()
    
    function reverseString(str){
        var str = str.split("").reverse().join("")
        
        if (Word == str) {
            output.innerHTML = `${str} is a palindrome of ${Word}!`
        } else {
            output.innerHTML = `${str} is not a palindrome of ${Word}!`
        }
    }
    reverseString(Word)


})
