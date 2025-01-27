package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: Boolean, c: T_A[Byte]) extends T_A[Byte]
case class CC_C() extends T_A[Byte]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_C()) => 0 
}
}
// This is not matched: Pattern match is empty without constants