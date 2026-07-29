<template>
    <tr>
        <td>{{ income.name }}</td>
        <td>{{ income.amount}}€</td>
        <td>{{ income.incomeCategory.color }}</td>
    </tr>
</template>

<script>
export default{
    props:['income']
}
</script>