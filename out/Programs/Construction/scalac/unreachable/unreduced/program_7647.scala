package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[C, C], C], C]
case class CC_B[D](a: Byte, b: D, c: T_A[D, D]) extends T_A[T_A[T_A[D, D], D], D]
case class CC_C[E](a: CC_A[E], b: Boolean, c: (CC_B[Boolean],T_A[Char, Boolean])) extends T_A[T_A[T_A[E, E], E], E]

val v_a: T_A[T_A[T_A[Boolean, Boolean], Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(0, _, _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(CC_A(), _, (CC_B(_, _, _),_)) => 3 
}
}