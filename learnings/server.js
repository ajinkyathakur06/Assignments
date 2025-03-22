const express = require('express');
const fs = require('fs');
const path = require('path');

const app = express();
const PORT = 3000; // Use any port you'd like

// Directory containing the folders and files
const rootDirectory = path.join(__dirname, 'shared_files');

// Helper function to generate HTML for file links
function generateFileLinks(folderName, files) {
    return files
        .map(file => `<li><a href="/files/${folderName}/${file}" download>${file}</a></li>`)
        .join('');
}

// Root route to list all folders
app.get('/', (req, res) => {
    fs.readdir(rootDirectory, { withFileTypes: true }, (err, entries) => {
        if (err) {
            console.error('Error reading folders:', err);
            res.status(500).send('Error reading folders.');
            return;
        }

        // Filter for directories (folders only)
        const folders = entries.filter(entry => entry.isDirectory()).map(entry => entry.name);

        // Generate links to folder routes
        const folderLinks = folders
            .map(folder => `<li><a href="/folder/${folder}">${folder}</a></li>`)
            .join('');

        res.send(`
            <html>
                <head>
                    <title>Local File Sharing</title>
                </head>
                <body>
                    <h1>Welcome to Local File Sharing</h1>
                    <p>Select a folder to view its files:</p>
                    <ul>
                        ${folderLinks}
                    </ul>
                </body>
            </html>
        `);
    });
});

// Route for each folder to display files
app.get('/folder/:folderName', (req, res) => {
    const folderName = req.params.folderName;
    const folderPath = path.join(rootDirectory, folderName);

    fs.readdir(folderPath, (err, files) => {
        if (err) {
            console.error('Error reading files in folder:', err);
            res.status(500).send('Error reading files in folder.');
            return;
        }

        // Generate HTML with file links
        const fileLinks = generateFileLinks(folderName, files);

        res.send(`
            <html>
                <head>
                    <title>${folderName} Files</title>
                </head>
                <body>
                    <h1>Files in Folder: ${folderName}</h1>
                    <p>Click the links below to download files:</p>
                    <ul>
                        ${fileLinks}
                    </ul>
                    <a href="/">Back to Folders</a>
                </body>
            </html>
        `);
    });
});

// Serve static files (supports files in all folders)
app.use('/files', express.static(rootDirectory));

// Start the server
app.listen(PORT, () => {
    console.log(`Server is running at http://192.168.17.147:${PORT}`);
});
