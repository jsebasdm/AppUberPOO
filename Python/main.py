from uberX import UberX
from uberPool import UberPool
from driver import Driver

if __name__ == "__main__":

    uberX = UberX("AMD123",Driver("Sebas","12345JSD"),"Bentley","Bentayga")
    uberPool = UberPool("ABC777",Driver("Alejo","9876AGD"),"BMW","1-series")
    print(vars(uberX))
    print(vars(uberX.driver))
    print(vars(uberPool))
    print(vars(uberPool.driver))
