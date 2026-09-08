<template>
    <tr @click="">
        <td>{{ income.name }}</td>
        <td>{{ income.amount}}€</td>
        <td>{{ income.incomeCategory.color }}</td>
    </tr>
</template>

<script>
export default{
    props:['income'],
    methods:{
        updateIncomeModal(income){
            
        }
    }
}
</script>