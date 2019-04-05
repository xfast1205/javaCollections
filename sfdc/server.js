//Install express server
const express = require('express');
const path = require('path');

const app = express();

app.use(express.static(__dirname + '/dist/heroku-sfdc-status'));

app.get('/*', function(req,res) {
    
res.sendFile(path.join(__dirname+'/dist/heroku-sfdc-status/index.html'));
});


// Start the app by listening on the default Heroku port
app.listen(process.env.PORT || 8080);
