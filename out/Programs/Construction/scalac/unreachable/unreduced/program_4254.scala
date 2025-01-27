package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: CC_A, b: T_B[CC_A]) extends T_A
case class CC_C[B](a: CC_B, b: (Boolean,T_A)) extends T_A
case class CC_D(a: CC_B, b: Char, c: CC_A) extends T_B[T_B[CC_C[T_A]]]
case class CC_E(a: T_A, b: Int) extends T_B[T_B[CC_C[T_A]]]
case class CC_F(a: CC_C[Char], b: CC_D, c: CC_A) extends T_B[T_B[CC_C[T_A]]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_)