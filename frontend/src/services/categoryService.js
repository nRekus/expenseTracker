async function getAllCategories(){
    const response = await fetch("/categories")
    if(!response.ok){
        throw new Error("Something went wrong while getting all Categories",response.status);
    }
    const data = await response.json()
    console.log(data)
}