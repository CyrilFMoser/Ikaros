package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int, b: (T_B[T_A, T_A],T_B[Byte, Boolean]), c: T_A) extends T_A
case class CC_B[C](a: T_B[C, C], b: Int, c: T_A) extends T_A
case class CC_C() extends T_B[CC_B[(T_A,T_A)], (CC_B[T_A],CC_B[T_A])]
case class CC_D(a: T_B[T_B[Byte, T_A], T_B[CC_A, CC_A]]) extends T_B[T_A, T_A]
case class CC_E[D](a: T_B[T_A, T_A], b: D, c: CC_D) extends T_B[T_A, T_A]

val v_a: T_B[T_A, T_A] = null
val v_b: Int = v_a match{
  case CC_E(CC_D(_), _, _) => 0 
  case CC_E(CC_E(_, _, _), _, _) => 1 
}
}
// This is not matched: CC_D(_)