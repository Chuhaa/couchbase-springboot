package com.example.couchbase.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class AgreementName {
    public String agreementType;
    public MasterAgreementType masterAgreementType;
    public ArrayList<ContractualDefinitionsType> contractualDefinitionsType;
}
