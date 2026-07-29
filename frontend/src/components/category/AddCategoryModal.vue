<template>
    <div v-if="modelValue">
    <BModal
        :model-value="modelValue"
        @update:model-value="$emit('update:modelValue',$event)"
        >Hello Wrld
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