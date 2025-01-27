package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[D]() extends T_A[D, T_A[D, D]]
case class CC_C[E](a: (Int,Byte)) extends T_A[CC_B[Byte], E]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C((12,_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants