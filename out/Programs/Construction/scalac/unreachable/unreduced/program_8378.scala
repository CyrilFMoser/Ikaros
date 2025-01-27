package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_B]
case class CC_B[D]() extends T_A[Char, D]
case class CC_C() extends T_B
case class CC_D(a: T_A[((Boolean,Char),T_B), CC_C], b: CC_B[(CC_C,CC_C)], c: Boolean) extends T_B
case class CC_E(a: T_A[CC_A[CC_D], T_B], b: CC_A[T_A[T_B, T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, true) => 1 
  case CC_D(_, _, false) => 2 
}
}
// This is not matched: CC_E(_, CC_A())