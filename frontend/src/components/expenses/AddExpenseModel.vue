<template>
<div v-if="modelValue">
    <BModal
    :model-value="modelValue"
    @update:model-value="$emit('update:modelValue',$event)"
    title="Add Expense"
    ok-title="Ausgaben hinzufügen"
    cancel-title="Abbrechen">

        <div id="form-container">
            <label><input type="text"></label><br>
            <label><input type="number"></label><br>
            <label><input type="text"></label><br>
        </div>
    </BModal>
</div>
</template>

    <script>
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
                expense:{
                    name:'',
                    amout:0,
                    category:null,
                    date:null
                }
            }
        }
    }
</script>

<style></style>