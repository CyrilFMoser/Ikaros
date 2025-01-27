package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B(a: Byte, b: CC_A) extends T_A
case class CC_C(a: CC_A, b: Boolean) extends T_A
case class CC_D(a: (Int,T_A)) extends T_B[T_A]
case class CC_E(a: (T_B[T_A],CC_A), b: T_B[CC_D], c: Char) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_A(CC_D(_)), _) => 1 
  case CC_C(CC_A(CC_E(_, _, _)), _) => 2 
}
}
// This is not matched: CC_A(_)