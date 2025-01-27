package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_B(a: Int, b: T_A[Boolean, Byte]) extends T_A[T_B[T_B[Byte, Boolean], T_B[Byte, Boolean]], T_B[Byte, Boolean]]

val v_a: T_A[T_B[T_B[Byte, Boolean], T_B[Byte, Boolean]], T_B[Byte, Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(12, _) => 0 
}
}
// This is not matched: Pattern match is empty without constants