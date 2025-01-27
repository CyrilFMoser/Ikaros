package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_B]
case class CC_B(a: T_A[CC_A[T_B], T_A[Byte, T_B]]) extends T_B
case class CC_C(a: Char, b: T_B) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, CC_B(_)) => 1 
  case CC_C(_, CC_C(_, _)) => 2 
  case CC_C(_, CC_D()) => 3 
  case CC_D() => 4 
}
}