package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[(Byte,Boolean)], b: T_A[(Boolean,Boolean)]) extends T_A[Byte]
case class CC_D[D]() extends T_B[D]
case class CC_E[E]() extends T_B[E]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_E(), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants