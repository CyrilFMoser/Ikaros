package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Char]], b: T_A[T_A[Char]]) extends T_A[T_A[T_B[Int]]]
case class CC_B(a: T_B[T_B[CC_A]]) extends T_A[T_A[T_B[Int]]]
case class CC_C() extends T_A[T_A[T_B[Int]]]
case class CC_D[C, D]() extends T_B[C]
case class CC_E[E](a: T_B[E]) extends T_B[E]

val v_a: T_A[T_A[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_D()) => 1 
  case CC_B(CC_E(CC_D())) => 2 
  case CC_B(CC_E(CC_E(_))) => 3 
  case CC_C() => 4 
}
}