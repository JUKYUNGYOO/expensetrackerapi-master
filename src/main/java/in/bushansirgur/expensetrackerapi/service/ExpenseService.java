package in.bushansirgur.expensetrackerapi.service;

import java.util.List;

import in.bushansirgur.expensetrackerapi.entity.Expense;

public interface ExpenseService {

    List<Expense> getAllExpenses();
}

/*
we will create an interface expense service and it will condense
a single method good all expenses.
 */