package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: Char) extends T_A[T_B]
case class CC_B(a: T_B) extends T_A[T_B]
case class CC_C(a: (T_B,Char)) extends T_A[T_B]
case class CC_D(a: T_B, b: Byte, c: T_A[Char]) extends T_B
case class CC_E(a: Int, b: CC_D, c: Byte) extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_), _), _) => 1 
  case CC_A(CC_A(CC_C(_), _), _) => 2 
  case CC_A(CC_B(CC_D(_, _, _)), _) => 3 
  case CC_A(CC_B(CC_E(_, _, _)), _) => 4 
}
}
// This is not matched: CC_A(CC_C((_,_)), _)