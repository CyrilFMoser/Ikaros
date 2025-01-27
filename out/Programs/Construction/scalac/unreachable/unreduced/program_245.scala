package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int]) extends T_A[Int]
case class CC_B(a: CC_A, b: T_A[Char]) extends T_A[Int]
case class CC_C(a: T_A[T_A[Char]], b: T_A[T_A[CC_B]]) extends T_A[(CC_A,CC_A)]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _)) => 1 
}
}