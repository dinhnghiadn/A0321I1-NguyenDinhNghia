package com.codegym.case_study.model;


import javax.persistence.*;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contractDetailtId;
    private int quantity;

    @ManyToOne(targetEntity = Contract.class)
    @JoinColumn(name = "contractId", referencedColumnName = "contractId")
    private Contract contract;

    @ManyToOne(targetEntity = AttachService.class)
    @JoinColumn(name = "attachServiceId", referencedColumnName = "attachServiceId")
    private AttachService attachService;

    public ContractDetail() {
    }

    public int getContractDetailtId() {
        return contractDetailtId;
    }

    public void setContractDetailtId(int contractDetailtId) {
        this.contractDetailtId = contractDetailtId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }
}
