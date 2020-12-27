#SOLVE FOLLOWING LINEAR PROGRAMMING PROBLEM USING DUAL SIMPLEX METHOD USING R PROGRAMMING
# Max z=40x1+50x2
#subject to
#2x1 + 3x2 <= 3
#8x1 + 4x2 <= 5
# x1, x2 >= 0

library(lpSolve)

# coefficient of objectivev function
f.obj <- c(40, 50)

# set matrix corresponding to coefficients of constraints by rows
# do not consider the non-negative constraint, it is automatically assumed
f.com <- matrix(c(2, 3, 8, 4), nrow=2, byrow=TRUE)

#set unequality signs
f.dir <- c("<=", "<=")


#set right hand side coefficients
f.rhs <- c(3, 5)

#final value(z)
lp("max", f.obj, f.com, f.dir, f.rhs)

#variables final values
lp("max", f.obj, f.com, f.dir, f.rhs)$solution

#sensitivities
lp("max", f.obj, f.com, f.dir, f.rhs, compute.sens=TRUE)$sens.coef.from
lp("max", f.obj, f.com, f.dir, f.rhs, compute.sens=TRUE)$sens.coef.to

#Dual values(first dual of the constraints and then DUAL of the variables)
#duals of the constraints and variables are mixed
lp("max", f.obj, f.com, f.dir, f.rhs, compute.sens=TRUE)$duals


#duals lower and upper limits
lp("max", f.obj, f.com, f.dir, f.rhs, compute.sens=TRUE)$duals.from
lp("max", f.obj, f.com, f.dir, f.rhs, compute.sens=TRUE)$duals.to