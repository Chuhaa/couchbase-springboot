package com.example.couchbase.model.trade;

import com.example.couchbase.model.payloads.ContractDetails;
import com.example.couchbase.model.payloads.Meta;
import com.example.couchbase.model.payloads.Trade;

import java.time.Instant;

public class MiniTrade extends TradeEntity {

    private static String description="";

    public Trade getTrade(int i) {
        trade = new Trade();
        trade.setTradeTime(Instant.now());
        meta = new Meta();
        meta.setGlobalKey("MiniTrade");
        meta.setExternalKey("MiniTrade");
        trade.setMeta(meta);
        trade.setContractDetails(getContractDetails(i));
        trade.setExternalRefNumber(i);
        return trade;
    }


    public static ContractDetails getContractDetails(int i) {
        ContractDetails contractDetails = new ContractDetails();
        contractDetails.setContractId(i);
        if(description.isEmpty()) {
            description = "{\n" +
                    "    \"meta\": {\n" +
                    "      \"globalKey\": \"25kb\"\n" +
                    "    },\n" +
                    "    \"25kbtrades\": [{\n" +
                    "      \"contractDetails\": {\n" +
                    "        \"documentation\": [\n" +
                    "          {\n" +
                    "            \"legalAgreementIdentification\": {\n" +
                    "              \"agreementName\": {\n" +
                    "                \"agreementType\": \"MASTER_AGREEMENT\",\n" +
                    "                \"masterAgreementType\": {\n" +
                    "                  \"value\": \"ISDA_MASTER\"\n" +
                    "                }\n" +
                    "              },\n" +
                    "              \"vintage\": 1992\n" +
                    "            },\n" +
                    "            \"meta\": {\n" +
                    "              \"globalKey\": \"32000f4f\"\n" +
                    "            }\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"legalAgreementIdentification\": {\n" +
                    "              \"agreementName\": {\n" +
                    "                \"agreementType\": \"CONFIRMATION\",\n" +
                    "                \"contractualDefinitionsType\": [\n" +
                    "                  {\n" +
                    "                    \"value\": \"ISDA_1999_CREDIT\"\n" +
                    "                  }\n" +
                    "                ],\n" +
                    "                \"contractualTermsSupplement\": [\n" +
                    "                  {\n" +
                    "                    \"contractualTermsSupplementType\": {\n" +
                    "                      \"value\": \"ISDA_1999_CREDIT_SUCCESSOR_AND_CREDIT_EVENTS\"\n" +
                    "                    }\n" +
                    "                  },\n" +
                    "                  {\n" +
                    "                    \"contractualTermsSupplementType\": {\n" +
                    "                      \"value\": \"ISDA_1999_CREDIT_CONVERTIBLE_EXCHANGEABLE_ACCRETING_OBLIGATIONS\"\n" +
                    "                    }\n" +
                    "                  }\n" +
                    "                ]\n" +
                    "              }\n" +
                    "            },\n" +
                    "            \"meta\": {\n" +
                    "              \"globalKey\": \"91a1d99b\"\n" +
                    "            }\n" +
                    "          }\n" +
                    "        ],\n" +
                    "        \"meta\": {\n" +
                    "          \"globalKey\": \"e82472ec\"\n" +
                    "        }\n" +
                    "      },\n" +
                    "      \"meta\": {\n" +
                    "        \"globalKey\": \"dc56a774\"\n" +
                    "      },\n" +
                    "      \"party\": [\n" +
                    "        {\n" +
                    "          \"meta\": {\n" +
                    "            \"externalKey\": \"party1\",\n" +
                    "            \"globalKey\": \"1cdd0752\"\n" +
                    "          },\n" +
                    "          \"name\": {\n" +
                    "            \"value\": \"XYZ Bank\"\n" +
                    "          },\n" +
                    "          \"partyId\": [\n" +
                    "            {\n" +
                    "              \"identifier\": {\n" +
                    "                \"meta\": {\n" +
                    "                  \"scheme\": \"http://www.fpml.org/coding-scheme/external/iso17442\"\n" +
                    "                },\n" +
                    "                \"value\": \"254900BIAQJIUV6DLE92\"\n" +
                    "              },\n" +
                    "              \"identifierType\": \"LEI\",\n" +
                    "              \"meta\": {\n" +
                    "                \"globalKey\": \"b507782f\"\n" +
                    "              }\n" +
                    "            }\n" +
                    "          ]\n" +
                    "        },\n" +
                    "        {\n" +
                    "          \"meta\": {\n" +
                    "            \"externalKey\": \"party2\",\n" +
                    "            \"globalKey\": \"c546aadb\"\n" +
                    "          },\n" +
                    "          \"name\": {\n" +
                    "            \"value\": \"ABC Bank\"\n" +
                    "          },\n" +
                    "          \"partyId\": [\n" +
                    "            {\n" +
                    "              \"identifier\": {\n" +
                    "                \"meta\": {\n" +
                    "                  \"scheme\": \"http://www.fpml.org/coding-scheme/external/iso17442\"\n" +
                    "                },\n" +
                    "                \"value\": \"549300VBWWV6BYQOWM67\"\n" +
                    "              },\n" +
                    "              \"identifierType\": \"LEI\",\n" +
                    "              \"meta\": {\n" +
                    "                \"globalKey\": \"618c3061\"\n" +
                    "              }\n" +
                    "            }\n" +
                    "          ]\n" +
                    "        }\n" +
                    "      ],\n" +
                    "      \"tradableProduct\": {\n" +
                    "        \"ancillaryParty\": [\n" +
                    "          {\n" +
                    "            \"partyReference\": [\n" +
                    "              {\n" +
                    "                \"externalReference\": \"party1\",\n" +
                    "                \"globalReference\": \"1cdd0752\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"role\": \"CALCULATION_AGENT_INDEPENDENT\"\n" +
                    "          }\n" +
                    "        ],\n" +
                    "        \"counterparty\": [\n" +
                    "          {\n" +
                    "            \"partyReference\": {\n" +
                    "              \"externalReference\": \"party2\",\n" +
                    "              \"globalReference\": \"c546aadb\"\n" +
                    "            },\n" +
                    "            \"role\": \"PARTY_1\"\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"partyReference\": {\n" +
                    "              \"externalReference\": \"party1\",\n" +
                    "              \"globalReference\": \"1cdd0752\"\n" +
                    "            },\n" +
                    "            \"role\": \"PARTY_2\"\n" +
                    "          }\n" +
                    "        ],\n" +
                    "        \"product\": {\n" +
                    "          \"contractualProduct\": {\n" +
                    "            \"productTaxonomy\": [\n" +
                    "              {\n" +
                    "                \"source\": \"ISDA\",\n" +
                    "                \"productQualifier\": \"CreditDefaultSwap_SingleName\"\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"economicTerms\": {\n" +
                    "              \"calculationAgent\": {\n" +
                    "                \"calculationAgentBusinessCenter\": {\n" +
                    "                  \"value\": \"GBLO\"\n" +
                    "                },\n" +
                    "                \"calculationAgentParty\": \"CALCULATION_AGENT_INDEPENDENT\"\n" +
                    "              },\n" +
                    "              \"dateAdjustments\": {\n" +
                    "                \"businessCenters\": {\n" +
                    "                  \"businessCenter\": [\n" +
                    "                    {\n" +
                    "                      \"value\": \"GBLO\"\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                      \"value\": \"USNY\"\n" +
                    "                    },\n" +
                    "                    {\n" +
                    "                      \"value\": \"JPTO\"\n" +
                    "                    }\n" +
                    "                  ],\n" +
                    "                  \"meta\": {\n" +
                    "                    \"globalKey\": \"81e56a96\"\n" +
                    "                  }\n" +
                    "                },\n" +
                    "                \"businessDayConvention\": \"MODFOLLOWING\",\n" +
                    "                \"meta\": {\n" +
                    "                  \"globalKey\": \"58681de7\"\n" +
                    "                }\n" +
                    "              },\n" +
                    "              \"effectiveDate\": {\n" +
                    "                \"adjustableDate\": {\n" +
                    "                  \"dateAdjustments\": {\n" +
                    "                    \"businessDayConvention\": \"NONE\",\n" +
                    "                    \"meta\": {\n" +
                    "                      \"globalKey\": \"24a738\"\n" +
                    "                    }\n" +
                    "                  },\n" +
                    "                  \"meta\": {\n" +
                    "                    \"globalKey\": \"eb0a8cfd\"\n" +
                    "                  },\n" +
                    "                  \"unadjustedDate\": \"2002-12-05\"\n" +
                    "                },\n" +
                    "                \"meta\": {\n" +
                    "                  \"globalKey\": \"eb0a8cfd\"\n" +
                    "                }\n" +
                    "              },\n" +
                    "              \"payout\": {\n" +
                    "                \"creditDefaultPayout\": {\n" +
                    "                  \"payerReceiver\": {\n" +
                    "                    \"payer\": \"PARTY_1\",\n" +
                    "                    \"receiver\": \"PARTY_2\"\n" +
                    "                  },\n" +
                    "                  \"priceQuantity\": {\n" +
                    "                    \"meta\": {\n" +
                    "                      \"globalKey\": \"0\"\n" +
                    "                    },\n" +
                    "                    \"quantitySchedule\": {\n" +
                    "                      \"address\": {\n" +
                    "                        \"scope\": \"DOCUMENT\",\n" +
                    "                        \"value\": \"quantity-2\"\n" +
                    "                      }\n" +
                    "                    }\n" +
                    "                  },\n" +
                    "                  \"settlementTerms\": {\n" +
                    "                    \"meta\": {\n" +
                    "                      \"globalKey\": \"45e0d7b2\"\n" +
                    "                    },\n" +
                    "                    \"settlementCurrency\": {\n" +
                    "                      \"value\": \"JPY\"\n" +
                    "                    },\n" +
                    "                    \"settlementType\": \"PHYSICAL\",\n" +
                    "                    \"physicalSettlementTerms\": {\n" +
                    "                      \"deliverableObligations\": {\n" +
                    "                        \"accruedInterest\": false,\n" +
                    "                        \"assignableLoan\": {\n" +
                    "                          \"applicable\": true\n" +
                    "                        },\n" +
                    "                        \"category\": \"BOND_OR_LOAN\",\n" +
                    "                        \"consentRequiredLoan\": {\n" +
                    "                          \"applicable\": true\n" +
                    "                        },\n" +
                    "                        \"maximumMaturity\": {\n" +
                    "                          \"meta\": {\n" +
                    "                            \"globalKey\": \"ae5\"\n" +
                    "                          },\n" +
                    "                          \"period\": \"Y\",\n" +
                    "                          \"periodMultiplier\": 30\n" +
                    "                        },\n" +
                    "                        \"notBearer\": true,\n" +
                    "                        \"notContingent\": true,\n" +
                    "                        \"notSubordinated\": true,\n" +
                    "                        \"specifiedCurrency\": {\n" +
                    "                          \"applicable\": true\n" +
                    "                        },\n" +
                    "                        \"transferable\": true\n" +
                    "                      },\n" +
                    "                      \"escrow\": true,\n" +
                    "                      \"meta\": {\n" +
                    "                        \"globalKey\": \"237559c8\"\n" +
                    "                      },\n" +
                    "                      \"physicalSettlementPeriod\": {\n" +
                    "                        \"businessDays\": 30\n" +
                    "                      }\n" +
                    "                    }\n" +
                    "                  },\n" +
                    "                  \"generalTerms\": {\n" +
                    "                    \"referenceInformation\": {\n" +
                    "                      \"referenceEntity\": {\n" +
                    "                        \"entityId\": [\n" +
                    "                          {\n" +
                    "                            \"meta\": {\n" +
                    "                              \"scheme\": \"http://www.fpml.org/coding-scheme/external/entity-id-RED\"\n" +
                    "                            },\n" +
                    "                            \"value\": \"004CC9\"\n" +
                    "                          }\n" +
                    "                        ],\n" +
                    "                        \"meta\": {\n" +
                    "                          \"externalKey\": \"referenceEntity\",\n" +
                    "                          \"globalKey\": \"e414546d\"\n" +
                    "                        },\n" +
                    "                        \"name\": {\n" +
                    "                          \"value\": \"ACOM CO., LTD.\"\n" +
                    "                        }\n" +
                    "                      },\n" +
                    "                      \"referenceObligation\": [\n" +
                    "                        {\n" +
                    "                          \"primaryObligorReference\": {\n" +
                    "                            \"externalReference\": \"referenceEntity\",\n" +
                    "                            \"globalReference\": \"e414546d\"\n" +
                    "                          },\n" +
                    "                          \"security\": {\n" +
                    "                            \"productIdentifier\": [\n" +
                    "                              {\n" +
                    "                                \"value\": {\n" +
                    "                                  \"identifier\": {\n" +
                    "                                    \"meta\": {\n" +
                    "                                      \"scheme\": \"http://www.fpml.org/coding-scheme/external/instrument-id-ISIN\"\n" +
                    "                                    },\n" +
                    "                                    \"value\": \"JP310860A032\"\n" +
                    "                                  },\n" +
                    "                                  \"meta\": {\n" +
                    "                                    \"globalKey\": \"b94feaa3\"\n" +
                    "                                  },\n" +
                    "                                  \"source\": \"ISIN\"\n" +
                    "                                }\n" +
                    "                              }\n" +
                    "                            ],\n" +
                    "                            \"securityType\": \"DEBT\"\n" +
                    "                          }\n" +
                    "                        }\n" +
                    "                      ],\n" +
                    "                      \"referencePrice\": {\n" +
                    "                        \"unit\": {\n" +
                    "                          \"currency\": {\n" +
                    "                            \"value\": \"JPY\"\n" +
                    "                          }\n" +
                    "                        },\n" +
                    "                        \"value\": 1,\n" +
                    "                        \"perUnitOf\": {\n" +
                    "                          \"currency\": {\n" +
                    "                            \"value\": \"JPY\"\n" +
                    "                          }\n" +
                    "                        },\n" +
                    "                        \"priceExpression\": {\n" +
                    "                          \"priceType\": \"ASSET_PRICE\",\n" +
                    "                          \"spreadType\": \"BASE\"\n" +
                    "                        }\n" +
                    "                      }\n" +
                    "                    }\n" +
                    "                  },\n" +
                    "                  \"meta\": {\n" +
                    "                    \"globalKey\": \"48302727\"\n" +
                    "                  },\n" +
                    "                  \"protectionTerms\": [\n" +
                    "                    {\n" +
                    "                      \"creditEvents\": {\n" +
                    "                        \"bankruptcy\": true,\n" +
                    "                        \"creditEventNotice\": {\n" +
                    "                          \"notifyingParty\": [\n" +
                    "                            \"PARTY_1\",\n" +
                    "                            \"PARTY_2\"\n" +
                    "                          ],\n" +
                    "                          \"publiclyAvailableInformation\": {\n" +
                    "                            \"specifiedNumber\": 2,\n" +
                    "                            \"standardPublicSources\": true\n" +
                    "                          }\n" +
                    "                        },\n" +
                    "                        \"defaultRequirement\": {\n" +
                    "                          \"unit\": {\n" +
                    "                            \"currency\": {\n" +
                    "                              \"value\": \"JPY\"\n" +
                    "                            }\n" +
                    "                          },\n" +
                    "                          \"value\": 1000000000,\n" +
                    "                          \"meta\": {\n" +
                    "                            \"globalKey\": \"57e64854\"\n" +
                    "                          }\n" +
                    "                        },\n" +
                    "                        \"failureToPay\": {\n" +
                    "                          \"applicable\": true,\n" +
                    "                          \"paymentRequirement\": {\n" +
                    "                            \"unit\": {\n" +
                    "                              \"currency\": {\n" +
                    "                                \"value\": \"JPY\"\n" +
                    "                              }\n" +
                    "                            },\n" +
                    "                            \"value\": 100000000,\n" +
                    "                            \"meta\": {\n" +
                    "                              \"globalKey\": \"b883af02\"\n" +
                    "                            }\n" +
                    "                          }\n" +
                    "                        },\n" +
                    "                        \"meta\": {\n" +
                    "                          \"globalKey\": \"37b6c9b\"\n" +
                    "                        },\n" +
                    "                        \"restructuring\": {\n" +
                    "                          \"applicable\": true,\n" +
                    "                          \"restructuringType\": {\n" +
                    "                            \"value\": \"R\"\n" +
                    "                          }\n" +
                    "                        }\n" +
                    "                      },\n" +
                    "                      \"meta\": {\n" +
                    "                        \"globalKey\": \"a20292ff\"\n" +
                    "                      },\n" +
                    "                      \"obligations\": {\n" +
                    "                        \"category\": \"BORROWED_MONEY\",\n" +
                    "                        \"notSubordinated\": true\n" +
                    "                      }\n" +
                    "                    }\n" +
                    "                  ]\n" +
                    "                },\n" +
                    "                \"interestRatePayout\": [\n" +
                    "                  {\n" +
                    "                    \"payerReceiver\": {\n" +
                    "                      \"payer\": \"PARTY_1\",\n" +
                    "                      \"receiver\": \"PARTY_2\"\n" +
                    "                    },\n" +
                    "                    \"priceQuantity\": {\n" +
                    "                      \"meta\": {\n" +
                    "                        \"globalKey\": \"0\"\n" +
                    "                      },\n" +
                    "                      \"quantitySchedule\": {\n" +
                    "                        \"address\": {\n" +
                    "                          \"scope\": \"DOCUMENT\",\n" +
                    "                          \"value\": \"quantity-1\"\n" +
                    "                        }\n" +
                    "                      }\n" +
                    "                    },\n" +
                    "                    \"calculationPeriodDates\": {\n" +
                    "                      \"calculationPeriodFrequency\": {\n" +
                    "                        \"meta\": {\n" +
                    "                          \"globalKey\": \"12d20\"\n" +
                    "                        },\n" +
                    "                        \"period\": \"M\",\n" +
                    "                        \"periodMultiplier\": 3,\n" +
                    "                        \"rollConvention\": \"5\"\n" +
                    "                      },\n" +
                    "                      \"meta\": {\n" +
                    "                        \"globalKey\": \"12d20\"\n" +
                    "                      }\n" +
                    "                    },\n" +
                    "                    \"dayCountFraction\": {\n" +
                    "                      \"value\": \"ACT/360\"\n" +
                    "                    },\n" +
                    "                    \"meta\": {\n" +
                    "                      \"globalKey\": \"3146eaf0\"\n" +
                    "                    },\n" +
                    "                    \"paymentDates\": {\n" +
                    "                      \"firstPaymentDate\": \"2003-03-05\",\n" +
                    "                      \"meta\": {\n" +
                    "                        \"globalKey\": \"7473fe71\"\n" +
                    "                      },\n" +
                    "                      \"paymentFrequency\": {\n" +
                    "                        \"meta\": {\n" +
                    "                          \"globalKey\": \"956\"\n" +
                    "                        },\n" +
                    "                        \"period\": \"M\",\n" +
                    "                        \"periodMultiplier\": 3\n" +
                    "                      }\n" +
                    "                    },\n" +
                    "                    \"rateSpecification\": {\n" +
                    "                      \"fixedRate\": {\n" +
                    "                        \"meta\": {\n" +
                    "                          \"globalKey\": \"0\"\n" +
                    "                        },\n" +
                    "                        \"rateSchedule\": {\n" +
                    "                          \"price\": {\n" +
                    "                            \"address\": {\n" +
                    "                              \"scope\": \"DOCUMENT\",\n" +
                    "                              \"value\": \"price-1\"\n" +
                    "                            }\n" +
                    "                          }\n" +
                    "                        }\n" +
                    "                      }\n" +
                    "                    }\n" +
                    "                  }\n" +
                    "                ],\n" +
                    "                \"meta\": {\n" +
                    "                  \"globalKey\": \"ba2af897\"\n" +
                    "                }\n" +
                    "              },\n" +
                    "              \"terminationDate\": {\n" +
                    "                \"adjustableDate\": {\n" +
                    "                  \"dateAdjustments\": {\n" +
                    "                    \"businessCenters\": {\n" +
                    "                      \"businessCenter\": [\n" +
                    "                        {\n" +
                    "                          \"value\": \"GBLO\"\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                          \"value\": \"USNY\"\n" +
                    "                        },\n" +
                    "                        {\n" +
                    "                          \"value\": \"JPTO\"\n" +
                    "                        }\n" +
                    "                      ],\n" +
                    "                      \"meta\": {\n" +
                    "                        \"globalKey\": \"81e56a96\"\n" +
                    "                      }\n" +
                    "                    },\n" +
                    "                    \"businessDayConvention\": \"MODFOLLOWING\",\n" +
                    "                    \"meta\": {\n" +
                    "                      \"globalKey\": \"58681de7\"\n" +
                    "                    }\n" +
                    "                  },\n" +
                    "                  \"meta\": {\n" +
                    "                    \"globalKey\": \"28faf882\"\n" +
                    "                  },\n" +
                    "                  \"unadjustedDate\": \"2007-12-05\"\n" +
                    "                },\n" +
                    "                \"meta\": {\n" +
                    "                  \"globalKey\": \"28faf882\"\n" +
                    "                }\n" +
                    "              }\n" +
                    "            },\n" +
                    "            \"meta\": {\n" +
                    "              \"globalKey\": \"b6180397\"\n" +
                    "            }\n" +
                    "          },\n" +
                    "          \"meta\": {\n" +
                    "            \"globalKey\": \"b6180397\"\n" +
                    "          }\n" +
                    "        },\n" +
                    "        \"tradeLot\": [\n" +
                    "          {\n" +
                    "            \"priceQuantity\": [\n" +
                    "              {\n" +
                    "                \"meta\": {\n" +
                    "                  \"globalKey\": \"f8e0b650\"\n" +
                    "                },\n" +
                    "                \"price\": [\n" +
                    "                  {\n" +
                    "                    \"meta\": {\n" +
                    "                      \"location\": [\n" +
                    "                        {\n" +
                    "                          \"scope\": \"DOCUMENT\",\n" +
                    "                          \"value\": \"price-1\"\n" +
                    "                        }\n" +
                    "                      ]\n" +
                    "                    },\n" +
                    "                    \"value\": {\n" +
                    "                      \"unit\": {\n" +
                    "                        \"currency\": {\n" +
                    "                          \"value\": \"JPY\"\n" +
                    "                        }\n" +
                    "                      },\n" +
                    "                      \"value\": 0.007,\n" +
                    "                      \"perUnitOf\": {\n" +
                    "                        \"currency\": {\n" +
                    "                          \"value\": \"JPY\"\n" +
                    "                        }\n" +
                    "                      },\n" +
                    "                      \"priceExpression\": {\n" +
                    "                        \"priceType\": \"INTEREST_RATE\"\n" +
                    "                      }\n" +
                    "                    }\n" +
                    "                  }\n" +
                    "                ],\n" +
                    "                \"quantity\": [\n" +
                    "                  {\n" +
                    "                    \"meta\": {\n" +
                    "                      \"location\": [\n" +
                    "                        {\n" +
                    "                          \"scope\": \"DOCUMENT\",\n" +
                    "                          \"value\": \"quantity-1\"\n" +
                    "                        }\n" +
                    "                      ]\n" +
                    "                    },\n" +
                    "                    \"value\": {\n" +
                    "                      \"unit\": {\n" +
                    "                        \"currency\": {\n" +
                    "                          \"value\": \"JPY\"\n" +
                    "                        }\n" +
                    "                      },\n" +
                    "                      \"value\": 500000000\n" +
                    "                    }\n" +
                    "                  }\n" +
                    "                ]\n" +
                    "              },\n" +
                    "              {\n" +
                    "                \"meta\": {\n" +
                    "                  \"globalKey\": \"d74a447e\"\n" +
                    "                },\n" +
                    "                \"quantity\": [\n" +
                    "                  {\n" +
                    "                    \"meta\": {\n" +
                    "                      \"location\": [\n" +
                    "                        {\n" +
                    "                          \"scope\": \"DOCUMENT\",\n" +
                    "                          \"value\": \"quantity-2\"\n" +
                    "                        }\n" +
                    "                      ]\n" +
                    "                    },\n" +
                    "                    \"value\": {\n" +
                    "                      \"unit\": {\n" +
                    "                        \"currency\": {\n" +
                    "                          \"value\": \"JPY\"\n" +
                    "                        }\n" +
                    "                      },\n" +
                    "                      \"value\": 500000000\n" +
                    "                    }\n" +
                    "                  }\n" +
                    "                ]\n" +
                    "              }\n" +
                    "            ]\n" +
                    "          }\n" +
                    "        ]\n" +
                    "      },\n" +
                    "      \"tradeDate\": {\n" +
                    "        \"meta\": {\n" +
                    "          \"globalKey\": \"3e9304\"\n" +
                    "        },\n" +
                    "        \"value\": \"2002-12-04\"\n" +
                    "      },\n" +
                    "      \"tradeIdentifier\": [\n" +
                    "        {\n" +
                    "          \"assignedIdentifier\": [\n" +
                    "            {\n" +
                    "              \"identifier\": {\n" +
                    "                \"meta\": {\n" +
                    "                  \"scheme\": \"http://www.swapswire.com/spec/2001/trade-id-1-0\"\n" +
                    "                },\n" +
                    "                \"value\": \"37209\"\n" +
                    "              }\n" +
                    "            }\n" +
                    "          ],\n" +
                    "          \"issuerReference\": {\n" +
                    "            \"externalReference\": \"party1\",\n" +
                    "            \"globalReference\": \"1cdd0752\"\n" +
                    "          },\n" +
                    "          \"meta\": {\n" +
                    "            \"globalKey\": \"af3ad922\"\n" +
                    "          }\n" +
                    "        },\n" +
                    "        {\n" +
                    "          \"assignedIdentifier\": [\n" +
                    "            {\n" +
                    "              \"identifier\": {\n" +
                    "                \"meta\": {\n" +
                    "                  \"scheme\": \"http://www.swapswire.com/spec/2001/trade-id-1-0\"\n" +
                    "                },\n" +
                    "                \"value\": \"37209\"\n" +
                    "              }\n" +
                    "            }\n" +
                    "          ],\n" +
                    "          \"issuerReference\": {\n" +
                    "            \"externalReference\": \"party2\",\n" +
                    "            \"globalReference\": \"c546aadb\"\n" +
                    "          },\n" +
                    "          \"meta\": {\n" +
                    "            \"globalKey\": \"af3ad923\"\n" +
                    "          }\n" +
                    "        },\n" +
                    "        {\n" +
                    "          \"assignedIdentifier\": [\n" +
                    "            {\n" +
                    "              \"identifier\": {\n" +
                    "                \"meta\": {\n" +
                    "                  \"scheme\": \"http://www.swapswire.com/spec/2001/trade-id-1-0\"\n" +
                    "                },\n" +
                    "                \"value\": \"37209\"\n" +
                    "              }\n" +
                    "            }\n" +
                    "          ],\n" +
                    "          \"issuerReference\": {\n" +
                    "            \"externalReference\": \"party2\",\n" +
                    "            \"globalReference\": \"c546aadb\"\n" +
                    "          },\n" +
                    "          \"meta\": {\n" +
                    "            \"globalKey\": \"af3ad923\"\n" +
                    "          }\n" +
                    "        },\n" +
                    "        {\n" +
                    "          \"assignedIdentifier\": [\n" +
                    "            {\n" +
                    "              \"identifier\": {\n" +
                    "                \"meta\": {\n" +
                    "                  \"scheme\": \"http://www.swapswire.com/spec/2001/trade-id-1-0\"\n" +
                    "                },\n" +
                    "                \"value\": \"37209\"\n" +
                    "              }\n" +
                    "            }\n" +
                    "          ],\n" +
                    "          \"issuerReference\": {\n" +
                    "            \"externalReference\": \"party2\",\n" +
                    "            \"globalReference\": \"c546aadb\"\n" +
                    "          },\n" +
                    "          \"meta\": {\n" +
                    "            \"globalKey\": \"af3ad923\"\n" +
                    "          }\n" +
                    "        },\n" +
                    "        {\n" +
                    "          \"assignedIdentifier\": [\n" +
                    "            {\n" +
                    "              \"identifier\": {\n" +
                    "                \"meta\": {\n" +
                    "                  \"scheme\": \"http://www.swapswire.com/spec/2001/trade-id-1-0\"\n" +
                    "                },\n" +
                    "                \"value\": \"37209\"\n" +
                    "              }\n" +
                    "            }\n" +
                    "          ],\n" +
                    "          \"issuerReference\": {\n" +
                    "            \"externalReference\": \"party2\",\n" +
                    "            \"globalReference\": \"c546aadb\"\n" +
                    "          },\n" +
                    "          \"meta\": {\n" +
                    "            \"globalKey\": \"af3ad923\"\n" +
                    "          }\n" +
                    "        },\n" +
                    "        {\n" +
                    "          \"assignedIdentifier\": [\n" +
                    "            {\n" +
                    "              \"identifier\": {\n" +
                    "                \"meta\": {\n" +
                    "                  \"scheme\": \"http://www.swapswire.com/spec/2001/trade-id-1-0\"\n" +
                    "                },\n" +
                    "                \"value\": \"37209\"\n" +
                    "              }\n" +
                    "            }\n" +
                    "          ],\n" +
                    "          \"issuerReference\": {\n" +
                    "            \"externalReference\": \"party2\",\n" +
                    "            \"globalReference\": \"c546aadb\"\n" +
                    "          },\n" +
                    "          \"meta\": {\n" +
                    "            \"globalKey\": \"af3ad923\"\n" +
                    "          }\n" +
                    "        },\n" +
                    "        {\n" +
                    "          \"assignedIdentifier\": [\n" +
                    "            {\n" +
                    "              \"identifier\": {\n" +
                    "                \"meta\": {\n" +
                    "                  \"scheme\": \"http://www.swapswire.com/spec/2001/trade-id-1-0\"\n" +
                    "                },\n" +
                    "                \"value\": \"37209\"\n" +
                    "              }\n" +
                    "            }\n" +
                    "          ],\n" +
                    "          \"issuerReference\": {\n" +
                    "            \"externalReference\": \"party2\",\n" +
                    "            \"globalReference\": \"c546aadb\"\n" +
                    "          },\n" +
                    "          \"meta\": {\n" +
                    "            \"globalKey\": \"af3ad923\"\n" +
                    "          }\n" +
                    "        },\n" +
                    "        {\n" +
                    "          \"assignedIdentifier\": [\n" +
                    "            {\n" +
                    "              \"identifier\": {\n" +
                    "                \"meta\": {\n" +
                    "                  \"scheme\": \"http://www.swapswire.com/spec/2001/trade-id-1-0\"\n" +
                    "                },\n" +
                    "                \"value\": \"37209\"\n" +
                    "              }\n" +
                    "            }\n" +
                    "          ],\n" +
                    "          \"issuerReference\": {\n" +
                    "            \"externalReference\": \"party2\",\n" +
                    "            \"globalReference\": \"c546aadb\"\n" +
                    "          },\n" +
                    "          \"meta\": {\n" +
                    "            \"globalKey\": \"af3ad923\"\n" +
                    "          }\n" +
                    "        },\n" +
                    "        {\n" +
                    "          \"assignedIdentifier\": [\n" +
                    "            {\n" +
                    "              \"identifier\": {\n" +
                    "                \"meta\": {\n" +
                    "                  \"scheme\": \"http://www.swapswire.com/spec/2001/trade-id-1-0\"\n" +
                    "                },\n" +
                    "                \"value\": \"37209\"\n" +
                    "              }\n" +
                    "            }\n" +
                    "          ],\n" +
                    "          \"issuerReference\": {\n" +
                    "            \"externalReference\": \"party2\",\n" +
                    "            \"globalReference\": \"c546aadb\"\n" +
                    "          },\n" +
                    "          \"meta\": {\n" +
                    "            \"globalKey\": \"af3ad923\"\n" +
                    "          }\n" +
                    "        },\n" +
                    "        {\n" +
                    "          \"assignedIdentifier\": [\n" +
                    "            {\n" +
                    "              \"identifier\": {\n" +
                    "                \"meta\": {\n" +
                    "                  \"scheme\": \"http://www.swapswire.com/spec/2001/trade-id-1-0\"\n" +
                    "                },\n" +
                    "                \"value\": \"37209\"\n" +
                    "              }\n" +
                    "            }\n" +
                    "          ],\n" +
                    "          \"issuerReference\": {\n" +
                    "            \"externalReference\": \"party2\",\n" +
                    "            \"globalReference\": \"c546aadb\"\n" +
                    "          },\n" +
                    "          \"meta\": {\n" +
                    "            \"globalKey\": \"af3ad923\"\n" +
                    "          }\n" +
                    "        },\n" +
                    "        {\n" +
                    "            \"assignedIdentifier\": [\n" +
                    "              {\n" +
                    "                \"identifier\": {\n" +
                    "                  \"meta\": {\n" +
                    "                    \"scheme\": \"http://www.swapswire.com/spec/2001/trade-id-1-0\"\n" +
                    "                  },\n" +
                    "                  \"value\": \"37209\"\n" +
                    "                }\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"issuerReference\": {\n" +
                    "              \"externalReference\": \"party2\",\n" +
                    "              \"globalReference\": \"c546aadb\"\n" +
                    "            },\n" +
                    "            \"meta\": {\n" +
                    "              \"globalKey\": \"af3ad923\"\n" +
                    "            }\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"assignedIdentifier\": [\n" +
                    "              {\n" +
                    "                \"identifier\": {\n" +
                    "                  \"meta\": {\n" +
                    "                    \"scheme\": \"http://www.swapswire.com/spec/2001/trade-id-1-0\"\n" +
                    "                  },\n" +
                    "                  \"value\": \"37209\"\n" +
                    "                }\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"issuerReference\": {\n" +
                    "              \"externalReference\": \"party2\",\n" +
                    "              \"globalReference\": \"c546aadb\"\n" +
                    "            },\n" +
                    "            \"meta\": {\n" +
                    "              \"globalKey\": \"af3ad923\"\n" +
                    "            }\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"assignedIdentifier\": [\n" +
                    "              {\n" +
                    "                \"identifier\": {\n" +
                    "                  \"meta\": {\n" +
                    "                    \"scheme\": \"http://www.swapswire.com/spec/2001/trade-id-1-0\"\n" +
                    "                  },\n" +
                    "                  \"value\": \"37209\"\n" +
                    "                }\n" +
                    "              }\n" +
                    "            ],\n" +
                    "            \"issuerReference\": {\n" +
                    "              \"externalReference\": \"party2\",\n" +
                    "              \"globalReference\": \"c546aadb\"\n" +
                    "            },\n" +
                    "            \"meta\": {\n" +
                    "              \"globalKey\": \"af3ad923\"\n" +
                    "            }\n" +
                    "          }\n" +
                    "      ]\n" +
                    "    }]\n" +
                    "  }";
        }
        contractDetails.setDescription(description);
        return contractDetails;
    }

}
