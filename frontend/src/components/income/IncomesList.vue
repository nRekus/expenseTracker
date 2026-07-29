<template>
<table>
    <thead>
        <tr>
            <th>Einkommensart</th>
            <th>Menge</th>
            <th>Kategorie</th>
        </tr>
    </thead>
    <tbody v-for="inc in income">
        <IncomesListItem :income="inc" />
    </tbody>
    <tfoot>
        <tr>
            <th scope="row">Gesamteinkommen:</th>
            <td>{{this.income.reduce((e,v) => e+v.amount,0)}}€</td>
        </tr>
    </tfoot>
</table>
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
            },{
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