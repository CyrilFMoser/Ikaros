package Program_30 

object Test {
sealed trait T_A[B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: (Char,Int)) extends T_A[E]
case class CC_C[G]() extends T_B[Byte, G]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, ('x',_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants