<template>
    <div id="outer" v-if="visible">

        <div id="modalValueInput">
    <label for="categoryName">Category Name: </label>
    <input type="text" name="categoryName" id="categoryName"><br>
            </div>

            <div id="modalValueInput">
    <label for="categoryColor">Category Color: </label>
    <input type="color" name="categoryColor" id="categoryColor" ><br>
            </div>
    <button @click="" id="addCategoryBtn">Add Categroy</button><br>
    
    </div>
</template>

<script>
import { postNewIncome } from '@/services/incomeService.js';
    export default{
        props:{
            visible:{
                type:Boolean,
                required:true
            }
        },
        data(){
            return{
                categroy:{
                    categoryName:'',
                    color:'red'
                }
            }
        },        
    }

</script>

<style>
/* #outer::before{
    opacity: 0;
    visibility: hidden;
} */
#outer{
    padding: 10px;
    border: 2px;
    border-color: black;
    border-style: solid;
    border-radius: 4px;    
    height: 80%;
    width: 60%;
    align-self: center;
    box-shadow: inset;
    display: grid;
    transition: opacity 2s ease-in;
}
/* #outer::after{
    visibility: visible;
    opacity: 1;
} */
#modalValueInput{
    padding-top: 10px;
    padding-bottom: 10px;
}
#addCategoryBtn{
    background-color: aquamarine;
    display: block;
}
</style>