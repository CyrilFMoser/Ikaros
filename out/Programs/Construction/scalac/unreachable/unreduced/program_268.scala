package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Char) extends T_A[T_B[D], D]
case class CC_B[E](a: T_A[E, T_B[E]], b: T_A[T_B[E], E]) extends T_A[T_B[E], E]
case class CC_C(a: Char, b: (T_B[Char],T_B[Byte])) extends T_B[CC_A[T_B[Boolean]]]

val v_a: T_A[T_B[CC_C], CC_C] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
  case CC_A(_) => 1 
  case CC_B(_, _) => 2 
}
}