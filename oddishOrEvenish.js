function oddEven(num){
    let nums = (num + "").split("").map(Number).reduce( (a, b) => a +b, 0);
    console.log(nums%2 == 0 ? "Evenish" : "Oddish")
}

oddEven(121)
oddEven(43)
oddEven(373)
oddEven(4433)