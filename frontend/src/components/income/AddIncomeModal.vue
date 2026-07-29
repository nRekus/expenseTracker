<template>
<div v-if="modelValue">
    <BModal
    :model-value="modelValue"
    @update:model-value="$emit('update:modelValue',$event)"
    title="Add Income"
    ok-title="Einkommen hinzufügen"
    cancel-title="Abbrechen"
    >
        <div id="form-container">
            <label>Einkommen <input v-model="income.name" placeholder="eBay" name="name"></label><br>
            <label>Menge (€) <input type="number" v-model.number="income.amount" placeholder="12.49€" name="amount"></label><br>
            <label>Kategorie <input v-model="income.category" placeholder="Nebenverdienst" name="category"></label>
        </div>
    </BModal>
</div>

</template>

<script>
import { postNewIncome } from '@/services/incomeService.js';
import { BModal } from 'bootstrap-vue-next';
export default{
    components:{
        BModal
    },
    props:{
        modelValue:{
            type:Boolean,
            default:false,
            required:true
        }
    },
    emits:['update:modelValue'],
    data(){
        return{
            income:{
                name:'',
                amount:0,
                category:null,
                date:null
            }
        }
    }
}
</script>

<style>
label{
    display: grid;
    margin-top: 1em;
    padding-left: 10px;
    align-items: center;
}
input{
    display: grid;
    padding: 10px;
    width: 200px;
    border-width: 2px;
    border-color: deeppink;
    border-radius: 8px;
}
.modal-body{
    background-color: cyan;
}
</style>