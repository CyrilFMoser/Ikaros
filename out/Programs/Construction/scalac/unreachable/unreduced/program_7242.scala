package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, T_B[D]]) extends T_A[D, T_B[D]]
case class CC_B[E](a: T_A[E, T_B[E]], b: Char) extends T_A[E, T_B[E]]
case class CC_C[F](a: CC_B[F], b: (T_A[Byte, Char],T_A[Int, Int])) extends T_B[F]
case class CC_D[G](a: T_B[G], b: G) extends T_B[G]
case class CC_E[H, I](a: CC_D[I]) extends T_B[H]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C(_, (_,_)) => 0 
  case CC_D(CC_C(CC_B(_, _), (_,_)), _) => 1 
  case CC_D(CC_D(CC_C(_, _), _), _) => 2 
  case CC_D(CC_D(CC_D(_, _), _), _) => 3 
  case CC_D(CC_D(CC_E(_), _), _) => 4 
  case CC_D(CC_E(_), _) => 5 
  case CC_E(_) => 6 
}
}