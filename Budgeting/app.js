var http = require('http');
var fs = require('fs');
var express = require('express');
var app = express();
var bodyParser = require('body-parser');
var urlencodedParser = bodyParser.urlencoded({ extended: false });
var date = new Date();

app.use(express.static('Images'));

app.set('view engine', 'ejs');

app.get('/', function(req, res) {
	res.render('forms', {spendings: req.query});
});

app.post('/', urlencodedParser, function(req, res) {
    fs.writeFileSync('writeSDCCU.txt', date.getMonth+ '-' +date.getDate+ '-' + date.getFullYear+ '     ' +req.body.amtSDCCU+ '     ' +req.body.purchaseSDCCU);
    res.render('forms', {spendings: req.query});
});

app.post('/', urlencodedParser, function(req, res) {
    fs.writeFileSync('writeChase.txt', req.body.amtChase + req.body.purchaseChase);
    res.render('forms', {spendings: req.query});
});

app.post('/', urlencodedParser, function(req, res) {
    fs.writeFileSync('writeCafCard.txt', req.body.amtCafCard + req.body.purchaseCafCard);
    res.render('forms', {spendings: req.query});
});

app.listen(2000);