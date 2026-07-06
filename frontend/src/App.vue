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

<!--
<iframe width="560" height="315" 
src="https://www.youtube.com/embed/DGmrSz4TTv0?si=ytpE3oNgno78X-t4" 
title="YouTube video player" frameborder="0" 
allow="accelerometer; autoplay; clipboard-write; 
encrypted-media; gyroscope; picture-in-picture; 
web-share" referrerpolicy="strict-origin-when-cross-origin" 
allowfullscreen>
</iframe>
-->
<!-- 
pandoc first-post.md -f markdown+emoji -t html -o test.html <---- Markdown to Html convert with emoji support 
(github emojis [https://gist.github.com/rxaviers/7360908])
-->
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
