package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: Int) extends T_A[E, T_B[((Int,Boolean),Boolean), T_A[Char, (Char,Boolean)]]]
case class CC_B[F](a: Char) extends T_A[F, T_B[((Int,Boolean),Boolean), T_A[Char, (Char,Boolean)]]]

val v_a: T_A[Int, T_B[((Int,Boolean),Boolean), T_A[Char, (Char,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_) => 2 
}
}