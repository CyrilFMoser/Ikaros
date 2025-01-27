package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_B(a: T_A[T_A[T_B]]) extends T_A[T_A[Int]]
case class CC_C[B](a: T_A[B]) extends T_B
case class CC_D(a: (CC_B,CC_B)) extends T_B
case class CC_E[C](a: C, b: C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D((CC_B(_),CC_B(_))) => 0 
  case CC_E(_, _) => 1 
}
}
// This is not matched: CC_C(_)