package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[D, D]) extends T_A[D, E]
case class CC_B[F](a: Int) extends T_A[F, T_A[F, F]]
case class CC_C[G, H](a: T_B[H]) extends T_A[G, H]
case class CC_D(a: (CC_C[Boolean, Byte],CC_C[Int, Boolean]), b: CC_B[T_A[Char, Int]], c: T_A[CC_C[Boolean, Byte], T_A[CC_C[Boolean, Byte], CC_C[Boolean, Byte]]]) extends T_B[Int]
case class CC_E(a: T_B[T_A[CC_D, CC_D]], b: T_A[Boolean, Byte], c: T_A[T_B[Byte], Boolean]) extends T_B[Int]
case class CC_F(a: T_B[Int], b: Boolean) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D((CC_C(_),CC_C(_)), CC_B(_), CC_A(CC_A(_))) => 0 
  case CC_D((CC_C(_),CC_C(_)), CC_B(_), CC_A(CC_C(_))) => 1 
  case CC_D((CC_C(_),CC_C(_)), CC_B(_), CC_B(_)) => 2 
  case CC_D((CC_C(_),CC_C(_)), CC_B(_), CC_C(_)) => 3 
  case CC_E(_, _, CC_A(CC_A(_))) => 4 
  case CC_E(_, _, CC_C(_)) => 5 
  case CC_F(_, _) => 6 
}
}
// This is not matched: CC_E(_, _, CC_A(CC_C(_)))