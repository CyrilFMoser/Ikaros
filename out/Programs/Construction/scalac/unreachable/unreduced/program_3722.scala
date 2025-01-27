package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[E, D], b: T_B[D]) extends T_A[E, D]
case class CC_B(a: T_B[Int], b: T_B[T_B[Int]]) extends T_B[Int]
case class CC_C(a: (T_B[CC_B],Byte), b: (CC_A[Byte, Int],Char)) extends T_B[Int]
case class CC_D(a: Char, b: CC_B, c: T_A[T_A[Int, CC_B], T_B[CC_C]]) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), _), _) => 0 
  case CC_B(CC_B(CC_C(_, _), _), _) => 1 
  case CC_B(CC_B(CC_D(_, _, _), _), _) => 2 
  case CC_B(CC_C(_, _), _) => 3 
  case CC_B(CC_D(_, _, _), _) => 4 
  case CC_C((_,_), (CC_A(_, _),_)) => 5 
  case CC_D(_, _, _) => 6 
}
}