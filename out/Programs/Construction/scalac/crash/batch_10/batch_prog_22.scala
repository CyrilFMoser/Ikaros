package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: Int) extends T_A[B]
case class CC_B[C](a: C, b: C) extends T_A[C]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _), _), _) => 1 
  case CC_A(CC_B(_, _), _) => 2 
  case CC_B(_, 'x') => 3 
  case CC_B(_, _) => 4 
}
}