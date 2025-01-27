package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[E](a: (Int,Char)) extends T_A[T_A[Int, Int], E]

val v_a: CC_B[T_A[T_A[Int, Int], CC_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_B((_,'x')) => 0 
}
}
// This is not matched: (CC_A (Tuple (CC_A Wildcard Wildcard T_A) (CC_B T_A)) Wildcard T_A)