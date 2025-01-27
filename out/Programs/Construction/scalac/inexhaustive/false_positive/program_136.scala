package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[T_A[Byte, Int], Int], C]
case class CC_B(a: T_A[T_A[T_B, T_B], T_A[Char, T_B]], b: Int) extends T_B
case class CC_C(a: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_B(_, 12)) => 1 
}
}
// This is not matched: CC_A(CC_B(CC_B(_)))