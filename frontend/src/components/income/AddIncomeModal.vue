<template>
    <div v-if="visible">
<input type="text" name="name" id="name" v-model="income.name">
<input type="text" name="amount" id="amount" v-model="income.amount">
<select name="categories" id="incomeCategory"></select>
<input type="date" name="incomeDate" id="incomeDate" v-model="income.date">
<button>Add Income</button>
</div>
</template>

<script>
import { postNewIncome } from '@/services/incomeService.js';
export default{
    data(){
        return{
            income:{
                name:'',
                amount:0,
                category:null,
                date:null
            }
        }
    },
    props:{
        visible:{
            type:Boolean,
            required:true
        }
    }
    

}
</script>

<style>

</style>