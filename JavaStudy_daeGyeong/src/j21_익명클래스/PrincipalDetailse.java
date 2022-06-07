package j21_익명클래스;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class PrincipalDetailse {
	public static void main(String[] args) {
		GrantedAuthority grantedAuthority3 = new GrantedAuthorityImpl();
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		strList.add("f");
		
		
		
		// 재사용을 하지 않고 내용을 바꾸면서 사용을 한다면 익명클래스가 효율적
		GrantedAuthority grantedAuthority = new GrantedAuthority() {
			
			@Override
			public Collection<String> getRoles(List<String> roles) {
				System.out.println(roles);
				return roles;
			}
		};
		
		GrantedAuthority grantedAuthority2 = new GrantedAuthority() {
			
			@Override
			public Collection<String> getRoles(List<String> roles) {
				return roles;
			}
		};
		
		grantedAuthority.getRoles(strList).forEach(r -> System.out.println(r));
		grantedAuthority2.getRoles(strList).forEach(r -> System.out.println(r));
		grantedAuthority3.getRoles(strList).forEach(r -> System.out.println(r));
		
		grantedAuthority2.getRoles(strList).stream().filter(s -> s.equals("d")).forEach(System.out::println);
		grantedAuthority2.getRoles(strList).stream().limit(2).forEach(System.out::println);
		
		System.out.println();
		
		Optional<String> opt = grantedAuthority2.getRoles(strList).stream().parallel().findAny();
		System.out.println(opt.orElse("!"));
	}
}