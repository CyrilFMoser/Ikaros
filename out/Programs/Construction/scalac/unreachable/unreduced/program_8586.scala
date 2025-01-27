package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, (T_B[Char],T_A[Char, Char])]
case class CC_B(a: T_A[T_B[(Boolean,Boolean)], CC_A[Boolean]]) extends T_B[T_B[CC_A[Boolean]]]
case class CC_C[E](a: Boolean, b: E, c: Char) extends T_B[E]

val v_a: T_B[T_B[CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, CC_C(_, _, _), 'x') => 1 
}
}
// This is not matched: CC_C(_, CC_C(_, _, _), _)