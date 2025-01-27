package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_B[D], b: T_A[D]) extends T_A[D]
case class CC_C[E](a: CC_B[E]) extends T_A[E]
case class CC_D(a: CC_B[T_B[Byte]], b: Boolean, c: T_A[Char]) extends T_B[CC_B[CC_B[Char]]]

val v_a: T_B[CC_B[CC_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_A()) => 0 
  case CC_D(_, _, CC_B(_, CC_A())) => 1 
  case CC_D(_, _, CC_B(_, CC_B(_, _))) => 2 
  case CC_D(_, _, CC_B(_, CC_C(_))) => 3 
  case CC_D(_, _, CC_C(_)) => 4 
}
}