package training;
import java.util.*;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Participant 
{
    private Integer id;
    private String name;
    private String skills;
}
class SortByName implements Comparator<Object> 
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		return ((Participant)o1).getName().compareTo(((Participant)o2).getName());
	}
}

class SortById implements Comparator<Object>{
	@Override
	public int compare(Object o1, Object o2) 
	{
		return ((Participant)o1).getId().compareTo(((Participant)o2).getId());
	}
}

class SortBySkills implements Comparator<Object>{
	@Override
	public int compare(Object o1, Object o2) 
	{
		return ((Participant)o1).getSkills().compareTo(((Participant)o2).getSkills());
	}
}