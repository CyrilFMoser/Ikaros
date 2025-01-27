package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean, b: T_A, c: (T_A,T_B[T_A])) extends T_A
case class CC_B(a: (T_B[Boolean],CC_A), b: T_B[CC_A]) extends T_A
case class CC_C(a: T_A, b: Int) extends T_A
case class CC_D(a: Int) extends T_B[Boolean]
case class CC_E(a: Char, b: CC_D, c: T_B[T_A]) extends T_B[Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((CC_D(_),CC_A(_, _, _)), _) => 1 
  case CC_C(_, _) => 2 
}
}
// This is not matched: CC_B((CC_E(_, _, _),CC_A(_, _, _)), _)