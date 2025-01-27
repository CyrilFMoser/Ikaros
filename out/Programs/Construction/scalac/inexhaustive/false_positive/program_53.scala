package Program_63 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_B[E, E]) extends T_A[E]
case class CC_C() extends T_A[CC_B[Char]]
case class CC_D[F]() extends T_B[F, T_A[T_B[CC_C, CC_C]]]

val v_a: T_A[T_A[CC_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_B(CC_B(_, _), _), _) => 1 
}
}
// This is not matched: CC_A()