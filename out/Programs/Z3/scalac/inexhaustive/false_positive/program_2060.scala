package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[D]() extends T_A[D, (Byte,Char)]
case class CC_B[F, E](a: Char) extends T_A[F, E]
case class CC_C() extends T_A[CC_A[(Boolean,Char)], (Byte,Char)]

val v_a: CC_B[CC_C, Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_A Boolean (CC_A Boolean Wildcard (T_A Boolean)) (T_A Boolean))