package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Byte, b: T_A[Char]) extends T_A[Char]
case class CC_B(a: T_A[Char], b: Int, c: T_A[(CC_A,CC_A)]) extends T_A[Char]
case class CC_C(a: T_B, b: T_A[CC_B]) extends T_B
case class CC_D(a: CC_B, b: T_B, c: CC_C) extends T_B
case class CC_E(a: CC_C, b: CC_B, c: CC_D) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_, _), _), _) => 0 
  case CC_C(CC_C(CC_D(_, _, _), _), _) => 1 
  case CC_C(CC_C(CC_E(_, _, _), _), _) => 2 
  case CC_C(CC_D(_, _, _), _) => 3 
  case CC_C(CC_E(CC_C(_, _), _, CC_D(_, _, _)), _) => 4 
  case CC_D(_, _, _) => 5 
  case CC_E(_, CC_B(CC_A(_, _), _, _), CC_D(_, _, CC_C(_, _))) => 6 
  case CC_E(_, CC_B(CC_B(_, _, _), _, _), CC_D(_, _, CC_C(_, _))) => 7 
}
}