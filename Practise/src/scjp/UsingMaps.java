	package scjp;

public class UsingMaps 
	{
		public String name;
		public UsingMaps(String n)
		{
			name = n;
		}

		public boolean equals(Object o)
		{
			if((o instanceof UsingMaps) && (((UsingMaps)o).name == name))
			{
				return true;
			}
			else
			{
				return false;
			}

		}
		public int hashCode()
		{
			return name.length();
		}
	}

