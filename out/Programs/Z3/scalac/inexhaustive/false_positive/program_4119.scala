package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B[E](a: ((Byte,Boolean),Int)) extends T_A[T_B[Boolean], E]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B((_,12)) => 0 
}
}
// This is not matched: Pattern match is empty without constants