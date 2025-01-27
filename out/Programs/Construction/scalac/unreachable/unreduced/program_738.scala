package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_B[E, E], E]) extends T_A[E, T_A[T_B[Char, Byte], T_B[Boolean, (Byte,Boolean)]]]
case class CC_B(a: T_A[T_A[Byte, Char], T_A[Int, Byte]]) extends T_A[CC_A[T_A[Byte, Boolean]], T_A[T_B[Char, Byte], T_B[Boolean, (Byte,Boolean)]]]
case class CC_C[G, F](a: ((Char,CC_B),T_B[CC_B, Int]), b: CC_B) extends T_B[F, G]
case class CC_D[H, I](a: H, b: T_B[H, I], c: T_B[I, H]) extends T_B[H, I]
case class CC_E[J, K](a: J, b: Int, c: T_B[J, K]) extends T_B[J, K]

val v_a: T_B[Boolean, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(_)) => 0 
  case CC_D(_, _, _) => 1 
  case CC_E(_, _, _) => 2 
}
}