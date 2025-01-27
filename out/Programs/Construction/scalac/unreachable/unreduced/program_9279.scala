package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[T_B[T_B[Int]], D]
case class CC_B(a: CC_A[(Byte,Int)], b: T_B[T_A[Char, Boolean]], c: T_B[T_A[Int, Int]]) extends T_A[T_B[T_B[Int]], (T_A[Byte, Byte],T_A[Char, Byte])]
case class CC_C[E](a: E, b: T_A[E, E], c: CC_B) extends T_A[T_B[T_B[Int]], E]
case class CC_D[F](a: T_B[F], b: F) extends T_B[F]
case class CC_E[G](a: T_A[G, G]) extends T_B[G]
case class CC_F[H](a: CC_D[H], b: T_B[((Char,Int),(Int,Boolean))], c: Int) extends T_B[H]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(_) => 1 
  case CC_F(CC_D(CC_D(_, _), _), CC_D(CC_D(_, _), (_,_)), _) => 2 
  case CC_F(CC_D(CC_E(_), _), CC_D(CC_D(_, _), (_,_)), _) => 3 
  case CC_F(CC_D(CC_D(_, _), _), CC_D(CC_E(_), (_,_)), _) => 4 
  case CC_F(CC_D(CC_E(_), _), CC_D(CC_E(_), (_,_)), _) => 5 
  case CC_F(CC_D(CC_F(_, _, _), _), CC_D(CC_E(_), (_,_)), _) => 6 
  case CC_F(CC_D(CC_D(_, _), _), CC_D(CC_F(_, _, _), (_,_)), _) => 7 
  case CC_F(CC_D(CC_E(_), _), CC_D(CC_F(_, _, _), (_,_)), _) => 8 
  case CC_F(CC_D(CC_F(_, _, _), _), CC_D(CC_F(_, _, _), (_,_)), _) => 9 
  case CC_F(CC_D(CC_D(_, _), _), CC_E(_), _) => 10 
  case CC_F(CC_D(CC_E(_), _), CC_E(_), _) => 11 
  case CC_F(CC_D(CC_F(_, _, _), _), CC_E(_), _) => 12 
  case CC_F(CC_D(CC_D(_, _), _), CC_F(_, _, _), _) => 13 
  case CC_F(CC_D(CC_E(_), _), CC_F(_, _, _), _) => 14 
  case CC_F(CC_D(CC_F(_, _, _), _), CC_F(_, _, _), _) => 15 
}
}
// This is not matched: CC_F(CC_D(CC_F(_, _, _), _), CC_D(CC_D(_, _), (_,_)), _)