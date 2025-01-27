package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: (Char,Boolean)) extends T_A[F, E]
case class CC_B[G]() extends T_B[G, CC_A[(Boolean,Byte), G]]

val v_a: CC_A[T_B[CC_B[Char], CC_A[(Boolean,Byte), CC_B[Char]]], Char] = null
val v_b: Int = v_a match{
  case CC_A(('x',_)) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)