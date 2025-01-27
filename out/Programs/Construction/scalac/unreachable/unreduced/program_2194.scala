package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_B[B](a: Char, b: T_A[B], c: T_A[B]) extends T_A[T_A[Int]]
case class CC_C(a: CC_B[(CC_A,CC_A)], b: T_A[CC_B[CC_A]], c: Boolean) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_C(_, _, _)) => 1 
  case CC_B('x', _, _) => 2 
  case CC_B(_, _, _) => 3 
  case CC_C(_, _, _) => 4 
}
}
// This is not matched: CC_A(CC_B(_, _, _))