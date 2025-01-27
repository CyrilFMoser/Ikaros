package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: T_A[Int], c: T_A[Byte]) extends T_A[Byte]
case class CC_B() extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_B()) => 0 
  case CC_B() => 1 
}
}
// This is not matched: Pattern match is empty without constants