function goMemory(){
document.getElementById("birthday").classList.add("hidden");
document.getElementById("memory").classList.remove("hidden");
}

function goProposal(){
document.getElementById("memory").classList.add("hidden");
document.getElementById("proposal").classList.remove("hidden");
}

/* YES */
function showYes(){

document.getElementById("question").style.display="none";
document.getElementById("buttons").style.display="none";

document.getElementById("result").innerHTML=`
❤️ Nijam cheppali ante ni love ki nen right person or kadhu ane vishayam nak thelidhu.

But I promise I will always stay with you ❤️

Fights may happen... but love is forever.

LOVE YOU VYSHUUUU ❤️
— Vikas
`;
}

/* NO */
function showNo(){

document.getElementById("question").style.display="none";
document.getElementById("buttons").style.display="none";

document.getElementById("result").innerHTML=`
🌹 Pedhaga cheppaniki inkem ledhu...

But you are still very special to me ❤️

I will never forget you.
— Vikas
`;
}
