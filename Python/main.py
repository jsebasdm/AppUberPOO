from car import Car
from account import Account
from uberX import UberX
from uberPool import UberPool

if __name__ == "__main__":

    uberX = UberX("AMD123",Account("Sebas","12345JSD"),"Bentley","Bentayga")
    uberPool = UberPool("ABC777",Account("Alejo","9876AGD"),"BMW","1-series")
    print(vars(uberX))
    print(vars(uberX.driver))
    print(vars(uberPool))
    print(vars(uberPool.driver))
