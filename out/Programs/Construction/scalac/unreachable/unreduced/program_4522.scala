package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], Boolean], b: (T_A,T_A), c: T_B[T_B[T_A, T_A], T_B[T_A, T_A]]) extends T_A
case class CC_B(a: T_B[T_B[CC_A, T_A], CC_A]) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: CC_A, b: T_A) extends T_B[CC_A, C]
case class CC_E[D](a: D) extends T_B[CC_A, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)