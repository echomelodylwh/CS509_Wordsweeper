Leo Task2 Readme
Task 2 is the first iteration of our overall group project.

Source Code Management
This project's Git repository can be checked out with the following command.
Git clone:https://github.com/Valar3726/CS509_Wordsweeper.git

Configurations
This Server applications must be configured to listen on Port 11425 (as is done in my mock client/server 
in the WordSweeper project) and client applications will seek to connect to localhost using this same port 
number.

How to Run
-Start Server
-Connect to Server
-CreateGame
-JoinGame

Example:
Input(ConnectRequest)
<?xml version="1.0" encoding="UTF-8"?><request id="b1feec65-bfe8-4526-b594-6e3773dcaad7"><connectRequest/></request>

Output(ConnectResponse)
<?xml version="1.0" encoding="UTF-8"?><response id="b1feec65-bfe8-4526-b594-6e3773dcaad7" success="true"><connectResponse id="86b4e90c-f307-4df4-9dd8-7363ff3e8e72"/></response>

Input(CreateGameRequest from samplePlayer)
<?xml version="1.0" encoding="UTF-8"?><request id="7102e469-a69a-4b80-95d3-df1c2b24bf1a"><createGameRequest name="samplePlayer"/></request>

Output(BoardResponse)
Board Message received for game:hg12jhd
Players:
  samplePlayer
<?xml version="1.0" encoding="UTF-8"?><response id="7102e469-a69a-4b80-95d3-df1c2b24bf1a" success="true"><boardResponse bonus="7,7" contents="DIMNCJAIBMBDHITZKCVPLFCOFWDBRWZBWTUSDSCDAHRALSWID" gameId="hg12jhd" managingUser="samplePlayer"><player board="MBDHKCVPOFWDZBWT" name="samplePlayer" position="2,1" score="0"/></boardResponse></response>

Input(JoinGameRequest from nextOne)
<?xml version="1.0" encoding="UTF-8"?><request id="6b63d7c8-8ac3-4a5d-a68f-35ef46ad0549"><joinGameRequest gameId="somePlace" name="nextOne"/></request>

Output(BoardResponse)
Board Message received for game:hg12jhd
Players:
  player0
  player1
<?xml version="1.0" encoding="UTF-8"?><response id="6b63d7c8-8ac3-4a5d-a68f-35ef46ad0549" success="true"><boardResponse bonus="4,3" contents="DIMNCJAIBMBDHITZKCVPLFCOFWDBRWZBWTUSDSCDAHRALSWID" gameId="hg12jhd" managingUser="player0"><player board="DIMNIBMBTZKCFCOF" name="player0" position="0,0" score="0"/><player board="ZKCVCOFWWZBWDSCD" name="player1" position="1,2" score="0"/></boardResponse></response>

Professor Submission Note
Be able to execute your server and have a mock client (mine actually) connect.
Demonstrate that server receives a createGameRequest from the mock Client to create a game (no password) and issues a boardResponse with the initiating player’s board to the client. Follow the protocol where the letters on the board state are comma-separated (this is a change based on 9-27-2016 lecture; review the protocol in wordsweeper.xsd)
Start a second mock Client to connect to your server
Demonstrate that server receives a joinGameRequest for the first game and issues a boardResponse to both the original client and the new participating client
Players should have a position on the board that is randomly selected from the original virtual board state
