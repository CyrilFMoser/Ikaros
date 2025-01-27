package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[E, E]]
case class CC_B[G, F](a: CC_A[G], b: G, c: T_A[G, F]) extends T_B[G, F]
case class CC_C[I, H](a: I, b: T_B[H, H]) extends T_B[I, H]

val v_a: T_B[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), 12, _) => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_C(_, CC_B(CC_A(), _, _)) => 2 
  case CC_C(_, CC_C(_, _)) => 3 
}
}