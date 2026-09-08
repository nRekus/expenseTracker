<template>
    <table>
        <thead>
            <tr>
                <th>Ausgabe</th>
                <th>Menge (€)</th>
                <th>Kategorie</th>
            </tr>
        </thead>

        <tbody v-for="exp in expenses">
            <ExpenseListItem :expense="exp"/>
        </tbody>
        <tfoot><tr>
            <th scope="row">Gesamtausgaben: </th>
            <td></td>
        </tr></tfoot>
    </table>
</template>

<script>
import ExpenseListItem from './ExpenseListItem.vue'
export default {
    components:{
        ExpenseListItem
    },
    data(){
        return{
            expenses:[
                
            ]
        }
    }

}
</script>

<style>

</style>