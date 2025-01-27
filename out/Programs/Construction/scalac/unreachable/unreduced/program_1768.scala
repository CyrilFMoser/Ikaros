package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(T_A,T_A), T_A], b: T_B[T_A, T_B[T_A, (Boolean,Char)]]) extends T_A
case class CC_B(a: CC_A, b: CC_A, c: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B[CC_C, C]
case class CC_E[D](a: Char) extends T_B[D, CC_C]
case class CC_F[E](a: T_B[E, CC_C]) extends T_B[E, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(_, _)) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _)