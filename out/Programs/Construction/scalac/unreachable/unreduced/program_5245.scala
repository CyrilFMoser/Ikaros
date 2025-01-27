package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, C], b: (Char,T_A[Int, Byte]), c: T_A[Byte, D]) extends T_A[Byte, C]
case class CC_B[E](a: E, b: E, c: T_A[Byte, E]) extends T_A[Byte, E]
case class CC_C[F](a: F) extends T_A[Byte, F]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B(_, _, CC_A(_, _, _)) => 1 
  case CC_B(_, _, CC_B(_, _, _)) => 2 
  case CC_B(_, _, CC_C(_)) => 3 
  case CC_C(_) => 4 
}
}