package vn.techmaster.buoi3_sboot;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Buoi3SbootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Buoi3SbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// // public void sayhello (String name){
		// // 	System.out.println("Chào"+name);
		// // }
		// List<Integer> numbers = List.of(10, 5, 3, 12, 6, 7, 5,3);
		// // Duyệt numbers
		// numbers.stream().forEach(number -> System.out.println(number));

		// // Tìm các giá trị chẵn trong list
		// numbers.stream()
		// .filter(number -> number %2 ==0)
		// .forEach(number -> System.out.println(number));

		// // Tìm các giá trị > 5 trong list
		// numbers.stream()
		// 	.filter(number -> number>5)
		// 	.forEach(number -> System.out.println(number));

		// // Tìm giá trị max trong list
		// Integer max = numbers.stream().max(Comparator.comparingInt(number -> number)).orElse(null);
		// System.out.println(max);

		// // Tìm giá trị min trong list
		// Integer min = numbers.stream().min(Comparator.comparingInt(number -> number)).orElse(null);
		// System.out.println(min);

		// // Tính tổng các phần tử của mảng
		// 	int sum = numbers.stream().reduce(0, (a, b) -> a + b);
		// 	 System.out.println( sum);

		// // Lấy danh sách các phần tử không trùng nhau
		// 	numbers.stream().distinct()
		// 	.forEach((number -> System.out.println(number)));

		// // Lấy 5 phần tử đầu tiên trong mảng (LIMIT)
		//  numbers.stream().limit(5).forEach(number -> System.out.println(number));

		// // Lấy phần tử từ thứ 3 -> thứ 5 (Skip + limit)
		// 	numbers.stream().skip(2).limit(3)
		// 	.forEach(number -> System.out.println(number));

		// // Lấy phần tử đầu tiên > 5(findFirst)
		//   numbers.stream().filter(number -> number>5).findFirst().orElse(null);

	
		// // Kiểm tra xem list có phải là list chẵn hay không (allMatch /somejs)
		// 	boolean check = numbers.stream().allMatch(number -> number %2 ==0);
		// 	if(check){
		// 		System.out.println("Đây là dẫy số chẵn"); 

		// 	}else{
		// 		System.out.println("Đây không phải là dãy số chẵn");
		// 	}

		// // Kiểm tra xem list có phần tử > 10 hay không 
		// boolean check1 = numbers.stream().anyMatch(number -> number >10);
		// if(check1){
		// 	System.out.println("List có phần tử lớn hơn 10");
		// }else{
		// 	System.out.println("List ko có phần tử lớn hơn 10");
		// }
		// // Có bao nhiêu phần tử > 5(filter + count)
		// long count =  numbers.stream().filter(number -> number>5).count();
		// System.out.println(count);

		// // Nhân đôi các phần tủ trong list và trả về list mới (Map/ mapjs)
		//  List<Integer> doubledNumbers = numbers.stream()
        //         .map(number -> number * 2)
        //         .collect(Collectors.toList());
		// System.out.println(doubledNumbers);
		// // Kiểm tra xem list không chứa giá trị nào = 8 hay không(noneMatch)
		// boolean check2 = numbers.stream().noneMatch(number -> number ==8);
		// if(check2){
		// 	System.out.println("List ko chứa phần tử  nào 8");
		// }else{
		// 	System.out.println("Có chứa");
		// }


	}

}
