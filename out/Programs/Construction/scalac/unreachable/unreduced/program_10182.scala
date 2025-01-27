package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[T_B, C]
case class CC_B(a: T_A[T_B, T_A[Byte, T_B]], b: T_A[CC_A[T_B], T_B]) extends T_B
case class CC_C[D](a: D, b: T_B) extends T_B
case class CC_D(a: CC_A[(CC_B,T_B)], b: Byte, c: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _) => 0 
  case CC_C(_, CC_C(_, _)) => 1 
  case CC_C(_, CC_D(CC_A(_, _), _, _)) => 2 
  case CC_D(CC_A((_,_), _), _, _) => 3 
}
}
// This is not matched: CC_C(_, CC_B(_, _))