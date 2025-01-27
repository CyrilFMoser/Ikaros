package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_B[Byte, Boolean], (Char,Int)]]
case class CC_B[D](a: (Int,((Boolean,Int),CC_A)), b: D, c: Boolean) extends T_A[T_B[T_B[Byte, Boolean], (Char,Int)]]
case class CC_C(a: T_B[CC_B[CC_A], CC_A]) extends T_A[T_B[T_B[Byte, Boolean], (Char,Int)]]
case class CC_D[E](a: T_B[CC_A, E], b: CC_A, c: CC_B[E]) extends T_B[CC_A, E]
case class CC_E[F](a: F, b: CC_C, c: Char) extends T_B[CC_A, F]
case class CC_F[G](a: G) extends T_B[CC_A, G]

val v_a: T_B[CC_A, CC_C] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_, _, _), _, CC_B(_, _, _)) => 0 
  case CC_D(CC_E(CC_C(_), CC_C(_), 'x'), _, CC_B(_, _, _)) => 1 
  case CC_D(CC_E(CC_C(_), CC_C(_), _), _, CC_B(_, _, _)) => 2 
  case CC_D(CC_F(_), _, CC_B(_, _, _)) => 3 
  case CC_E(_, CC_C(_), _) => 4 
  case CC_F(CC_C(_)) => 5 
}
}