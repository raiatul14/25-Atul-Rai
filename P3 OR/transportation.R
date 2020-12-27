##solve following transportation problem in which cells entries represent unit costs using R programming

#               "CUSTOMER 1", "CUSTOMER 2", "CUSTOMER 3", "CUSTOMER 4", SUPPLY
#SUPPLIER 1         10            2             20           11          15
#SUPPLIER 2         12            7             9            20          25
#SUPPLIER 3         4             14            16           18          10
#DEMAND             5             15            15           15

#import lpsolve package
library(lpSolve)

#set transportation costs matrix
costs <- matrix(c(10,2,20,11,
                  12,7,9,20,
                  4,14,16,18), nrow=3, byrow=TRUE)

#set customers and suppliers names
colnames(costs) <- c("Customer 1", "Customer 2", "Customer 3", "Customer 4")
rownames(costs) <- c("Supplier 1", "Supplier 2", "Supplier 3")

#set unequality/equality signs for suppliers
row.signs <-rep("<=", 3)

#set right hand side coefficients for suppliers
row.rhs <- c(15, 25, 10)

#set unequality/equality signs for customers
col.signs <- rep(">=", 4)

#set right hand side coefficients for customers
col.rhs <- c(5, 15, 15, 15)


#final value(z)
TotalCost <- lp.transport(costs, "min", row.signs, row.rhs, col.signs, col.rhs)

#variables final value
lp.transport(costs, "min", row.signs, row.rhs, col.signs, col.rhs)$solution

print(TotalCost)