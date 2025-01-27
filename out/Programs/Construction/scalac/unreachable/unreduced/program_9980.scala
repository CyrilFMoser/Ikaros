package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: (T_A,T_B[T_A, T_A]), c: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B(a: T_B[T_B[T_A, Boolean], CC_A], b: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: C, b: CC_A) extends T_B[T_B[T_A, CC_C], C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _)) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _, _)