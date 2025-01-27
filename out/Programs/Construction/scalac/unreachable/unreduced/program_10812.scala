package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F, G](a: T_B[G, E], b: T_B[G, G], c: (Int,T_A[Char, Byte])) extends T_A[E, F]
case class CC_B[H, I](a: T_A[H, I], b: T_A[I, I]) extends T_A[I, H]
case class CC_C[J](a: CC_B[J, J]) extends T_A[CC_B[T_A[Byte, Byte], T_B[Boolean, Char]], J]
case class CC_D[K](a: CC_B[CC_A[K, K, K], K], b: CC_C[T_A[K, K]], c: (CC_A[Char, Int, Byte],T_B[Int, Boolean])) extends T_B[CC_A[Boolean, T_A[Int, Int], T_A[Int, Char]], K]
case class CC_E[L](a: L, b: T_A[(Boolean,Byte), L], c: L) extends T_B[CC_A[Boolean, T_A[Int, Int], T_A[Int, Char]], L]

val v_a: T_B[CC_A[Boolean, T_A[Int, Int], T_A[Int, Char]], Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C(CC_B(_, _)), (CC_A(_, _, _),_)) => 0 
  case CC_E(_, CC_A(_, _, _), _) => 1 
  case CC_E(_, CC_B(CC_A(_, _, _), _), _) => 2 
  case CC_E(_, CC_B(CC_B(_, _), _), _) => 3 
}
}