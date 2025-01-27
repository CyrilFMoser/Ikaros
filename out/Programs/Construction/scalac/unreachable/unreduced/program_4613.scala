package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_A[Int]) extends T_A[(T_B,T_A[T_B])]
case class CC_B(a: T_A[Char], b: T_A[T_A[T_B]], c: T_A[Char]) extends T_A[(T_B,T_A[T_B])]
case class CC_C(a: CC_A) extends T_A[(T_B,T_A[T_B])]
case class CC_D() extends T_B

val v_a: T_A[(T_B,T_A[T_B])] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_, _)