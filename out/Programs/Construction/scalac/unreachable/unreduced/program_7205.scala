package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_B[T_A, Boolean],Byte)) extends T_A
case class CC_B(a: CC_A, b: Boolean) extends T_A
case class CC_C(a: Byte, b: T_A, c: T_A) extends T_A
case class CC_D[C](a: T_B[C, C], b: Char, c: CC_C) extends T_B[CC_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(CC_A((_,_)), _)