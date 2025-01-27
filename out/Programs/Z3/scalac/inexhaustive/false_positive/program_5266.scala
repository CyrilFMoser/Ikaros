package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_C(a: Byte) extends T_B[T_A[Byte]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants