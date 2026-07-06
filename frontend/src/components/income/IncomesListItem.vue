<template>
<div>
<table>
    <tr>
        <td>{{ income.name }}</td>
        <td>{{ income.amount }}</td>
        <td>{{ income.incomeCategory.color }}</td>
    </tr>
</table>
</div>
</template>

<script>
export default{
    props:['income']
}
</script>