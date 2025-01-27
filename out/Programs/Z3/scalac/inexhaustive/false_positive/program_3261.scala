package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B(a: T_A[Char], b: T_A[Byte]) extends T_A[(Boolean,Boolean)]
case class CC_C[D]() extends T_A[D]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_C()) => 0 
}
}
// This is not matched: Pattern match is empty without constants