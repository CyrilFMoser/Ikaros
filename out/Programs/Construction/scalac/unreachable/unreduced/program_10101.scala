package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Int, b: T_B[Char], c: T_B[T_B[Char]]) extends T_A[(T_A[Byte],T_B[Boolean])]
case class CC_B(a: T_B[Int]) extends T_A[T_A[(Char,(Int,Byte))]]
case class CC_C(a: T_B[T_A[CC_B]], b: CC_B, c: Char) extends T_A[T_A[(Char,(Int,Byte))]]
case class CC_D[C, D](a: T_A[D], b: CC_A) extends T_B[C]
case class CC_E[E](a: E) extends T_B[E]
case class CC_F[F](a: T_B[F], b: (CC_B,CC_B)) extends T_B[F]

val v_a: T_A[T_A[(Char,(Int,Byte))]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_D(_, CC_A(_, _, _)), CC_B(CC_D(_, _)), _) => 1 
  case CC_C(CC_F(CC_D(_, _), (_,_)), CC_B(CC_D(_, _)), _) => 2 
  case CC_C(CC_F(CC_E(_), (_,_)), CC_B(CC_D(_, _)), _) => 3 
  case CC_C(CC_F(CC_F(_, _), (_,_)), CC_B(CC_D(_, _)), _) => 4 
  case CC_C(CC_D(_, CC_A(_, _, _)), CC_B(CC_E(_)), _) => 5 
  case CC_C(CC_E(_), CC_B(CC_E(_)), _) => 6 
  case CC_C(CC_F(CC_D(_, _), (_,_)), CC_B(CC_E(_)), _) => 7 
  case CC_C(CC_F(CC_E(_), (_,_)), CC_B(CC_E(_)), _) => 8 
  case CC_C(CC_F(CC_F(_, _), (_,_)), CC_B(CC_E(_)), _) => 9 
  case CC_C(CC_D(_, CC_A(_, _, _)), CC_B(CC_F(_, _)), _) => 10 
  case CC_C(CC_E(_), CC_B(CC_F(_, _)), _) => 11 
  case CC_C(CC_F(CC_D(_, _), (_,_)), CC_B(CC_F(_, _)), _) => 12 
  case CC_C(CC_F(CC_E(_), (_,_)), CC_B(CC_F(_, _)), _) => 13 
  case CC_C(CC_F(CC_F(_, _), (_,_)), CC_B(CC_F(_, _)), _) => 14 
}
}
// This is not matched: CC_C(CC_E(_), CC_B(CC_D(_, _)), _)