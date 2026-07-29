<script setup>
import AddCategoryModal from './components/category/AddCategoryModal.vue';
import AddIncomeModal from './components/income/AddIncomeModal.vue';
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
    IncomesList,
    ExpenseList
  },
  data(){
    return{
      visible_category:false,
      visible_income:false
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
      <AddCategoryModal v-model="visible_category"/>
      <BButton class="addModalButton" @click="visible_category=!visible_category">+</BButton>
    </BCol>
      <!-- <BCol><AddIncomeModal v-model="visible_income"/>
  <BButton @click="visible_income!=visible_income">Add New Income</BButton>
    </BCol> -->
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
