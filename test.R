testMain <- function()
{

	wdbc=read.table("wdbc.txt", header=T, sep=",")
	basic = wdbc[1:3]
    p<-'HelloRWorld HelloRWorld HelloRWorld'
    
    test = data.matrix(wdbc[1:3])
    return(test)
    
    #return(basic)
    
    #return(wdbc)
    #return(p)
}