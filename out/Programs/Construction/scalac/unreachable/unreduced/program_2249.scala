package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[Int, E]) extends T_A[Int, E]
case class CC_B[F, G](a: T_B[F, T_A[Int, G]]) extends T_B[F, G]
case class CC_C[I, H](a: H, b: (T_A[(Boolean,Int), Byte],T_A[Int, Int])) extends T_B[I, H]
case class CC_D[J]() extends T_B[J, CC_C[J, J]]

val v_a: T_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_))) => 0 
  case CC_B(CC_B(CC_C(_, _))) => 1 
  case CC_B(CC_C(_, (_,_))) => 2 
}
}
// This is not matched: CC_C(_, _)