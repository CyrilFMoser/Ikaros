package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[E, E], b: (T_A[Boolean, Byte],T_A[Boolean, Int])) extends T_A[E, F]
case class CC_B[G, H](a: T_A[G, H]) extends T_A[H, G]
case class CC_C[I]() extends T_A[I, Byte]
case class CC_D[J]() extends T_B[J, T_A[J, J]]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_B(CC_A(_, _))) => 1 
  case CC_B(CC_B(CC_B(_))) => 2 
  case CC_B(CC_B(CC_C())) => 3 
  case CC_C() => 4 
}
}
// This is not matched: CC_B(CC_A(_, _))