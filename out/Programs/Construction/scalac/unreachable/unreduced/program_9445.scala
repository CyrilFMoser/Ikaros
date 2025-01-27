package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: C, c: Char) extends T_A[C, (T_A[Byte, T_B],Int)]
case class CC_B(a: T_B) extends T_A[(T_A[T_B, T_B],T_B), (T_A[Byte, T_B],Int)]
case class CC_C(a: CC_A[T_A[Byte, T_B]]) extends T_B
case class CC_D(a: CC_A[(T_B,Boolean)]) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _)) => 0 
  case CC_D(CC_A((_,_), (_,_), _)) => 1 
  case CC_E() => 2 
}
}