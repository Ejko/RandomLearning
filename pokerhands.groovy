def suiteList=["spades", "hearts", "diamonds", "clubs"]
def rankList=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "J", "Q", "K"]
def userRankList=[]
def userSuiteList=[]
String tempRank, tempSuite
boolean rankCorrect=true
for(int i=1;i<5;i++){
	print "Please enter a a rank for card " + i +":"
	tempRank=System.console().readLine()
	for(int j=0; j<rankList.size(); j++) {
		if(rankCorrect&&tempRank!=rankList[i]){
			rankCorrect=false
			}
		}	
	if(!RankCorrect){
		print "You have selected an incorrect rank, please try again: "
		tempRank=System.console().readLine()
		}
	else {
		userRankList[i]=tempRank
	}
	
