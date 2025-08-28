# Daily Git Auto-Commit Script
param([string]$commitMessage)

# Set error handling
$ErrorActionPreference = "Stop"

try {
    # Navigate to the repository
    Set-Location "C:\Users\alber\Documents\Java\Course 1"
    
    # Check for changes
    $changes = git status --porcelain
    if ($changes) {
        Write-Host "Found changes:"
        Write-Host $changes
        
        # Stage all changes
        git add --all

        # Set commit message
        if ([string]::IsNullOrEmpty($commitMessage)) {
            $commitMessage = "Daily Auto-Commit: $(Get-Date -Format 'yyyy-MM-dd HH:mm')"
        }
        
        # Commit
        git commit -m $commitMessage

        # Push to main branch
        git push origin main
        Write-Host "Auto-commit and push completed at $(Get-Date)"
    } else {
        Write-Host "No changes to commit at $(Get-Date)"
    }
}
catch {
    Write-Host "Error occurred: $($_.Exception.Message)"
    exit 1
}