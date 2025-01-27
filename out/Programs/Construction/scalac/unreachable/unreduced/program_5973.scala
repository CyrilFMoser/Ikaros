package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[((Char,Char),Char), E], b: T_A[E, Char]) extends T_A[E, Char]
case class CC_B[F]() extends T_A[F, Char]
case class CC_C[G](a: G) extends T_A[G, Char]
case class CC_D[H](a: H, b: H) extends T_B[H, T_A[H, H]]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B()) => 1 
  case CC_A(_, CC_C(_)) => 2 
  case CC_B() => 3 
  case CC_C(_) => 4 
}
}