package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: CC_A, b: T_A, c: CC_A) extends T_A
case class CC_C(a: (Char,T_A), b: CC_B, c: T_B[T_B[CC_A]]) extends T_B[CC_A]
case class CC_D() extends T_B[CC_A]
case class CC_E() extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C((_,_), CC_B(_, _, _), _) => 0 
  case CC_E() => 1 
}
}
// This is not matched: CC_D()