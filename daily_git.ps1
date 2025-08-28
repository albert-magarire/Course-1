# Navigate to the repository
Set-Location "C:\Users\alber\Documents\Java\Course 1"

# Check for changes
$changes = git status --porcelain
if ($changes) {
    # Stage all changes
    git add --all

    # Commit with a timestamp
    $commitMessage = "Daily Auto-Commit: $(Get-Date -Format 'yyyy-MM-dd HH:mm')"
    git commit -m $commitMessage

    # Push to main branch
    git push origin main
    Write-Host "Auto-commit and push completed at $(Get-Date)"
} else {
    Write-Host "No changes to commit at $(Get-Date)"
}