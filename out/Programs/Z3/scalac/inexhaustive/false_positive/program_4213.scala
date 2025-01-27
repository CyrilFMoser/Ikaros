package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[E](a: (Int,Int)) extends T_A[CC_A[E, E], E]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B((12,_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants