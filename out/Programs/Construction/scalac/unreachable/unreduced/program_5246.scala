package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char, b: T_B[T_B[Boolean]], c: T_B[T_B[Char]]) extends T_A[T_A[Int]]
case class CC_B(a: CC_A, b: T_A[T_A[CC_A]], c: CC_A) extends T_A[T_A[Int]]
case class CC_C(a: CC_B, b: T_A[T_A[CC_B]], c: Char) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _, CC_A(_, _, _)) => 1 
  case CC_C(_, _, _) => 2 
}
}