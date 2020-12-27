#solve following assignment problem represented in following matrix using R programming
# assignment problem
#       JOB1      JOB2      JOB3
#W1       15        10        9
#W2       9         15        10
#W3       10        12        8

#import lpsolve package
library(lpSolve)

#set assignment costs matrix
costs <- matrix(c(15, 10, 9,
                  9, 15, 10,
                  10, 12, 8), nrow=3, byrow = TRUE)

#print assignment costs matrix
costs

#final value (z)
lp.assign(costs)


#variables final solution
lp.assign(costs)$solution