package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, Char]]
case class CC_B[E](a: T_A[E, E], b: CC_A[Int], c: E) extends T_A[E, T_A[E, Char]]

val v_a: CC_B[T_A[CC_A[Int], T_A[CC_A[Int], Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(_, _, _)) => 0 
}
}
// This is not matched: (CC_A Byte Int Wildcard Wildcard (T_A Byte Int))