<script setup>
import AddCategoryModal from './components/category/AddCategoryModal.vue';
import AddIncomeModal from './components/income/AddIncomeModal.vue';
import IncomesList from './components/income/IncomesList.vue';

</script>

<script>
export default{
  data(){
    return{
      visible_category:false,
      visible_income:false
    }
  }
}
</script>

<template>
  <AddCategoryModal :visible="visible_category"/>
  <button @click="() => {visible_category = !visible_category}"> Add New Category </button>
  <br>
  <AddIncomeModal :visible="visible_income"/>
  <button @click="()=>{visible_income = !visible_income}">Add New Income</button>
  <br>
  <IncomesList/>
</template>

<style scoped>
#ytvideo{
  height: 320px;
  width: 480px;
  float: none;
  clear:both;
  margin: 2px auto;
  align-self: center;
}
</style>
