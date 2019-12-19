<?php
require_once 'Account.php';
require_once 'Car.php';
require_once 'UberX.php';
require_once 'UberPool.php';

$uberX = new UberX("AMD123", new Driver("Sebas", "12345JSD"), "Audi", "A1");
$uberX->showDataCar();
$uberPool = new UberPool("ABC777", new Driver("Alejo", "9876AGD"), "Carlsson", "C25");
$uberPool->showDataCar();
