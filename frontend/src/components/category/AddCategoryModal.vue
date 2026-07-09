<template>
    <BModal 
        v-model="local_vis",
        title="Add new Category">
    </BModal>
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
                },
                local_vis:this.$props.visible
            }
        },        
    }

</script>

<style>

#addCategoryBtn{
    background-color: aquamarine;
    display: block;
}
</style>