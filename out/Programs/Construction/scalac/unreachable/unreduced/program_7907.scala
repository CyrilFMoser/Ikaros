package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Char]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B[E, D]() extends T_B[D, E]
case class CC_C[G, F](a: G) extends T_B[G, F]
case class CC_D(a: T_B[T_A[CC_A], Boolean]) extends T_B[Byte, CC_A]

val v_a: T_B[T_B[Byte, CC_A], CC_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B()) => 1 
  case CC_C(CC_C(_)) => 2 
  case CC_C(CC_D(CC_B())) => 3 
  case CC_C(CC_D(CC_C(_))) => 4 
}
}