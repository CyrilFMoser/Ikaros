package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Int], b: T_A[T_A[Int]], c: T_A[T_A[Boolean]]) extends T_A[Int]
case class CC_B(a: CC_A, b: T_B[T_A[Int]], c: T_B[T_A[CC_A]]) extends T_A[Int]
case class CC_C() extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _, _)