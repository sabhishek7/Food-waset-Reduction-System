function deleteFoodWaste(id) {
    fetch(`/api/foodwaste/${id}`, {
        method: 'DELETE'
    }).then(response => {
        if (response.ok) {
            location.reload();
        } else {
            alert('Failed to delete food waste');
        }
    });
}
