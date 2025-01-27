package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: Int, b: CC_B, c: CC_A) extends T_A
case class CC_D[C](a: CC_A, b: T_B[C, C]) extends T_B[C, T_B[T_B[CC_A, Int], CC_A]]
case class CC_E[D](a: D, b: Byte) extends T_B[D, T_B[T_B[CC_A, Int], CC_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _, CC_A(_))