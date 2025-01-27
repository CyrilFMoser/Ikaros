package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[D, Byte]
case class CC_B[F, E](a: CC_A[F], b: T_A[E, E]) extends T_A[E, F]
case class CC_C[G](a: T_B[G], b: G, c: (T_A[Byte, Int],Char)) extends T_A[G, Byte]
case class CC_D[H](a: T_B[H]) extends T_B[T_A[(Char,Boolean), Byte]]
case class CC_E(a: (T_A[Byte, Int],CC_D[Byte])) extends T_B[T_A[(Char,Boolean), Byte]]
case class CC_F(a: CC_B[CC_E, T_A[CC_E, Byte]]) extends T_B[CC_A[CC_C[Boolean]]]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), CC_B(_, _)) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A(_)