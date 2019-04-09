# WTL
All assignments related to WTL!

## Changing permission for var/www/
To give only your user permission to /var/www. You want to change the group owner to your primary group. If your username is joe this is how you would do it.
'''
sudo chgrp joe /var/www
'''
You then need to chmod the directory so its writable by the group joe.
'''
sudo chmod 775 /var/www
'''
after that you can write to /var/www

If you want to be able to edit and delete existing files. You need to take ownership of them.
'''
sudo chown -R joe /var/www/*
'''
