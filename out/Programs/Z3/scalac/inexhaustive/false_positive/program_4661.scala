package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: C, c: C) extends T_A[(Char,Boolean), C]
case class CC_C[E, D]() extends T_A[E, D]

val v_a: CC_A[T_A[(Char,Boolean), CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_C()) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)