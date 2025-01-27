package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: T_A[C, C], c: Boolean) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[T_A[Char, Char], T_A[T_A[Char, Char], T_A[Char, Char]]]) extends T_A[CC_A[T_A[Byte, Char]], T_A[CC_A[T_A[Byte, Char]], CC_A[T_A[Byte, Char]]]]
case class CC_C(a: CC_B, b: CC_B) extends T_A[CC_A[T_A[Byte, Char]], T_A[CC_A[T_A[Byte, Char]], CC_A[T_A[Byte, Char]]]]

val v_a: T_A[CC_A[T_A[Byte, Char]], T_A[CC_A[T_A[Byte, Char]], CC_A[T_A[Byte, Char]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(_), _) => 2 
}
}