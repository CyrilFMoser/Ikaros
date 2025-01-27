package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Int], b: T_A[T_A[T_B]]) extends T_A[Int]
case class CC_B(a: T_B, b: T_B, c: T_A[T_A[Int]]) extends T_A[Int]
case class CC_C(a: CC_A, b: T_A[Int]) extends T_A[Int]
case class CC_D(a: CC_C) extends T_B
case class CC_E(a: (CC_A,CC_D)) extends T_B

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(CC_D(_), CC_D(_), _), _) => 1 
  case CC_A(CC_B(CC_D(_), CC_E(_), _), _) => 2 
  case CC_A(CC_B(CC_E(_), CC_D(_), _), _) => 3 
  case CC_A(CC_B(CC_E(_), CC_E(_), _), _) => 4 
  case CC_A(CC_C(CC_A(_, _), CC_A(_, _)), _) => 5 
  case CC_A(CC_C(CC_A(_, _), CC_C(_, _)), _) => 6 
  case CC_B(_, _, _) => 7 
  case CC_C(_, _) => 8 
}
}
// This is not matched: CC_A(CC_C(CC_A(_, _), CC_B(_, _, _)), _)