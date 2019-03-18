

CREATE TABLE contracts (
    contractId                  integer NOT NULL,
    contractNumber              varchar(100) NOT NULL,
    contractName                varchar(50) NOT NULL,
    operatorName                varchar(50) NOT NULL,
    validityPeriod              varchar(50) NOT NULL,
    line                        varchar(50) NOT NULL,
    totalDistanceInKM           varchar(50) NOT NULL,
    diatnacePerEveryDay         varchar(50) ,
    distancePerEveryDaySchoole  varchar(50) ,
    distancePerSaturday         varchar(50) ,
    distancePerSunday           varchar(50) ,
    productionRequiredInPercent varchar(50) NOT NULL,
    plannedRequiredDistanceInKM varchar(50) NOT NULL,
    actualDistanceInKM          varchar(50) ,
    actualCalculatedInPercent   varchar(50),
    missedDistanceInPercent     varchar(50),
    reasoningFromOperator       varchar(50),
    reasoningApproved           varchar(50) NOT NULL,
    totalFee                    numeric(4) NOT NULL,
    PRIMARY KEY (contractId)
);
