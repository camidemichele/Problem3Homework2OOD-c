In this program it was asked to make a user registration system using java swing and the pattern that was the best fit was the chain of responsability
because of what we have learned in class this is perfect for when we have a situation like this problem because it allows us to give access to certain
qualifications etc. We needed a username, password phone number had to be more than 10 digits but it was optional.I used a Validator interface and 
a BaseValidator class to connect the validators. Each validator checks something different, and if the information is correct it passes it to the next
one (thats basically the chain of responsibility pattern) . I also used Java Swing to make the registration form, and I changed the background to light
purple because its my favorite color. When the user clicks the register, the program checks the information and shows an error if something is wrong it 
says whats missing or if everything meets the parameters it says success.
