package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: D, b: (Byte,Char), c: T_A[Char]) extends T_A[D]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(_, _, _)) => 0 
}
}
// This is not matched: Pattern match is empty without constants