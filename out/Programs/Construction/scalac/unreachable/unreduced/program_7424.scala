package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Byte, b: T_A[D]) extends T_A[D]
case class CC_B[E](a: E) extends T_B[CC_A[Boolean], E]
case class CC_C[F](a: T_B[CC_A[Boolean], F], b: F) extends T_B[CC_A[Boolean], F]
case class CC_D[G](a: (T_B[Boolean, Char],Boolean), b: Int, c: T_B[CC_A[Boolean], G]) extends T_B[CC_A[Boolean], G]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_), 12) => 0 
  case CC_C(CC_C(_, _), 12) => 1 
  case CC_C(CC_D((_,_), _, CC_B(_)), 12) => 2 
  case CC_C(CC_D((_,_), _, CC_C(_, _)), 12) => 3 
  case CC_C(CC_D((_,_), _, CC_D(_, _, _)), 12) => 4 
  case CC_C(CC_B(_), _) => 5 
  case CC_C(CC_C(_, _), _) => 6 
  case CC_C(CC_D((_,_), _, CC_B(_)), _) => 7 
  case CC_C(CC_D((_,_), _, CC_C(_, _)), _) => 8 
  case CC_C(CC_D((_,_), _, CC_D(_, _, _)), _) => 9 
}
}