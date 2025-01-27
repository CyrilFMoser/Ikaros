package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[B]
case class CC_B[C](a: Int) extends T_A[C]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_A(_, CC_B(_))