<script setup>
import AddCategoryModal from './components/category/AddCategoryModal.vue';
import AddIncomeModal from './components/income/AddIncomeModal.vue';
import AddExpenseModal from './components/expenses/AddExpenseModel.vue';
import IncomesList from './components/income/IncomesList.vue';
import ExpenseList from './components/expenses/ExpenseList.vue';
import {BButton} from 'bootstrap-vue-next/components/BButton';
import {BCol} from 'bootstrap-vue-next/components/BCol';
import {BRow} from 'bootstrap-vue-next/components/BRow';
import {BContainer} from 'bootstrap-vue-next/components/BContainer';
import {BModal} from 'bootstrap-vue-next/components/BModal';
</script>

<script>
export default{
  components:{
    AddCategoryModal,
    AddIncomeModal,
    AddExpenseModal,
    IncomesList,
    ExpenseList,
    BContainer,
    BRow,
    BCol,
    BButton
  },
  data(){
    return{
      visible_category:false,
      visible_income:false,
      visible_expense:false
    }
  }
}
</script>

<template>
  
  <BContainer>
    <BRow>
      <BCol><IncomesList/></BCol>
      <BCol><ExpenseList/></BCol>
    </BRow>

    <BRow>
      <BCol>
        <AddIncomeModal v-model="visible_income"/>
  <BButton class="addModalButton" @click="visible_income=!visible_income">+</BButton>
    </BCol>
    <BCol>
      <AddExpenseModal v-model="visible_expense"/>
      <BButton class="addModalButton" @click="visible_expense=!visible_expense">+</BButton>
    </BCol>
    <BCol>
      <AddCategoryModal v-model="visible_category"/>
      <BButton class="addModalButton" @click="visible_category=!visible_category">+</BButton>
    </BCol>
    </BRow>
  </BContainer>
</template>

<style scoped>
.addModalButton{
  border: none;
  padding: 5px 10px 10px 10px;
  border-radius: 100%;
  background-color: black;
  height: 45px;
  width: 45px;
  color: white;
  font-weight: 24px;
}
</style>
