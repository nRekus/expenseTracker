<template>
<table>
    <thead>
        <tr>
            <th>Einkommensart</th>
            <th>Menge</th>
            <th>Kategorie</th>
        </tr>
    </thead>
    <tbody>
        <IncomesListItem v-for="inc in income" :income="inc" />
    </tbody>
    <tfoot>
        <tr>
            <th scope="row">Gesamteinkommen:</th>
            <!-- <td v-if="income">{{this.income.reduce((e,v) => e+v.amount,0)}}€</td> -->
        </tr>
    </tfoot>
</table>
</template>

<script>
import IncomesListItem from './IncomesListItem.vue';
import { getAllIncomes } from '../../services/incomeService.js';
export default{
    components:{
        IncomesListItem
    },
    data(){
        return{
            income:[]
        }
    },
    async created(){
        this.income = await getAllIncomes() 
    },
}
</script>