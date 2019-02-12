const fs = require('fs');

let amt = document.getElementByName('amtSDCCU')[0].value;
let purchase = document.getElementByName('purchaseSDCCU')[0].value;

fs.writeFile('TxtFiles/SDCCU.txt', amt, function(err, data){
    if (err) console.log(err);
});

fs.readFile('TxtFiles/SDCCU.txt', function(err, buf) {
  console.log(buf.toString());
});