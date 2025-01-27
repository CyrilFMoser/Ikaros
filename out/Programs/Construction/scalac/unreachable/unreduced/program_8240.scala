package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Char]) extends T_A[T_B]
case class CC_B(a: T_B, b: T_B) extends T_B
case class CC_C(a: T_A[((Char,Int),CC_B)], b: Boolean) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), _), _) => 0 
  case CC_B(CC_B(CC_C(_, _), _), _) => 1 
  case CC_C(_, _) => 2 
}
}
// This is not matched: CC_B(CC_C(_, _), _)