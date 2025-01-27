package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: T_A[Byte]) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: Pattern match is empty without constants