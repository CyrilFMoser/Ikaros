package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[T_B[Byte, Int], T_B[Boolean, Byte]]]
case class CC_B[F](a: Boolean) extends T_A[CC_A[(Int,Byte)], T_B[T_B[Byte, Int], T_B[Boolean, Byte]]]
case class CC_C[G](a: T_A[G, G], b: ((Boolean,Int),Boolean), c: G) extends T_A[G, T_B[T_B[Byte, Int], T_B[Boolean, Byte]]]
case class CC_D[H]() extends T_B[H, T_A[Int, CC_A[Byte]]]
case class CC_E[I](a: CC_D[I], b: CC_C[I]) extends T_B[I, T_A[Int, CC_A[Byte]]]

val v_a: T_A[CC_A[(Int,Byte)], T_B[T_B[Byte, Int], T_B[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}