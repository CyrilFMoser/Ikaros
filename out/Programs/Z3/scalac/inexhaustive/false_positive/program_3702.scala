package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[Byte, T_B], b: T_A[T_B, T_B]) extends T_A[T_B, T_B]
case class CC_B() extends T_A[T_B, T_B]

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
  case CC_B() => 1 
}
}
// This is not matched: Pattern match is empty without constants