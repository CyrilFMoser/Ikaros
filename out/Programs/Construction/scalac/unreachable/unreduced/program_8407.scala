package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: D, b: T_A[D, D], c: (Byte,T_A[Char, Int])) extends T_A[E, D]
case class CC_B[G, F](a: CC_A[F, F], b: G, c: T_A[F, F]) extends T_A[F, G]
case class CC_C[H](a: (Boolean,T_A[Int, Byte]), b: Int, c: T_B[H]) extends T_A[H, CC_A[H, H]]
case class CC_D() extends T_B[CC_A[T_B[Boolean], Int]]
case class CC_E() extends T_B[CC_A[T_B[Boolean], Int]]
case class CC_F() extends T_B[CC_A[T_B[Boolean], Int]]

val v_a: T_A[Boolean, CC_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), (_,_)), _) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _, _), (_,_)), _) => 1 
  case CC_A(_, CC_B(_, _, _), _) => 2 
  case CC_B(CC_A(_, _, (_,_)), CC_A(_, _, _), CC_A(_, _, _)) => 3 
  case CC_B(CC_A(_, _, (_,_)), CC_A(_, _, _), CC_B(CC_A(_, _, _), _, CC_A(_, _, _))) => 4 
  case CC_B(CC_A(_, _, (_,_)), CC_A(_, _, _), CC_B(CC_A(_, _, _), _, CC_B(_, _, _))) => 5 
  case CC_C((_,CC_A(_, _, _)), _, _) => 6 
  case CC_C((_,CC_B(_, _, _)), _, _) => 7 
}
}