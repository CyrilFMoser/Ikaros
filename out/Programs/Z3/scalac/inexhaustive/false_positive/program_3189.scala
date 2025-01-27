package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[F, E](a: Boolean, b: E) extends T_A[E, F]
case class CC_C[G, H]() extends T_A[G, H]

val v_a: CC_A[Char, T_A[((Char,Boolean),Int), T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: Pattern match is empty without constants