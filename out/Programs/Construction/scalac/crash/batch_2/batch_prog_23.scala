package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[E, E]) extends T_A[F, E]
case class CC_B[G, H]() extends T_A[G, H]
case class CC_C[I, J](a: T_B[J, I]) extends T_B[I, J]
case class CC_D[K](a: T_B[CC_A[K, K], K]) extends T_B[CC_A[(Byte,Boolean), Byte], K]
case class CC_E(a: CC_A[(Byte,Boolean), T_A[(Boolean,Int), Int]], b: T_A[T_B[Char, Byte], T_A[Byte, Char]], c: T_B[CC_A[Int, Int], CC_B[Int, Char]]) extends T_B[CC_B[CC_D[Byte], (Boolean,Byte)], Int]

val v_a: T_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_))) => 0 
}
}