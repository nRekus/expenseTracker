<template>
<div v-for="inc in income">
<IncomesListItem :income="inc" />
</div>
</template>

<script>
import IncomesListItem from './IncomesListItem.vue';

export default{
    components:{
        IncomesListItem
    },
    data(){
        return{
            income:[{
                amount:12,
                incomeCategory:{
                    color:'red',
                    categoryName:'9to5'
                },
                name:'Main Job'
            }]
        }
    }
}
</script>