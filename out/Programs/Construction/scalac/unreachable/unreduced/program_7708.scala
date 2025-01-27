package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: Byte, b: T_B[E, E]) extends T_A[E, F]
case class CC_B[G, H](a: CC_A[G, G], b: T_A[H, T_A[G, G]]) extends T_A[H, G]
case class CC_C[I, J](a: CC_A[J, I], b: (T_A[Char, Byte],T_A[Int, Boolean]), c: T_B[I, J]) extends T_A[J, I]
case class CC_D[K](a: CC_B[K, K], b: K, c: Boolean) extends T_B[K, T_A[K, K]]
case class CC_E(a: CC_C[Boolean, T_A[Int, Boolean]], b: CC_C[CC_C[Int, Boolean], CC_B[Char, Boolean]], c: CC_C[T_A[Boolean, Boolean], CC_D[Boolean]]) extends T_B[CC_D[Boolean], T_A[CC_D[Boolean], CC_D[Boolean]]]
case class CC_F(a: Byte, b: CC_E) extends T_B[CC_D[Boolean], T_A[CC_D[Boolean], CC_D[Boolean]]]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, _) => 2 
  case CC_C(CC_A(_, _), _, _) => 3 
}
}