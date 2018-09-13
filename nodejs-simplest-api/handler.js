'use strict';

module.exports.simplestHelloWorld = (event, context, callback) => {
  
  console.log(JSON.stringify(event));

  const response = {
    statusCode: 200,
    body: 'Simplest hello world'
  };

  callback(null, response);
};
