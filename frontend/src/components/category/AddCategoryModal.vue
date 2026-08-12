<template>
    <div v-if="modelValue">
    <BModal
        :model-value="modelValue"
        @update:model-value="$emit('update:modelValue',$event)"
        >
        <div id="form-container">
            <label>Kategoriebezeichnung: <input type="text"></label>
            <label>Farbe: <input type="text" name="" id=""></label>
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
                categroy:{
                    categoryName:'',
                    color:'red'
                },

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