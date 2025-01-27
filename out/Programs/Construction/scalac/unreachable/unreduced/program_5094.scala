package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Byte], T_B[Boolean, Char]], b: T_B[T_A[Char], T_A[Char]]) extends T_A[Boolean]
case class CC_B() extends T_A[Boolean]
case class CC_C[D](a: D, b: T_A[Boolean]) extends T_B[CC_B, D]
case class CC_D[E](a: T_B[CC_B, E], b: CC_A) extends T_B[CC_B, E]

val v_a: T_B[CC_B, Char] = null
val v_b: Int = v_a match{
  case CC_C('x', CC_A(_, _)) => 0 
  case CC_C(_, CC_A(_, _)) => 1 
  case CC_C('x', CC_B()) => 2 
  case CC_C(_, CC_B()) => 3 
  case CC_D(CC_C(_, _), CC_A(_, _)) => 4 
  case CC_D(CC_D(CC_C(_, _), CC_A(_, _)), CC_A(_, _)) => 5 
  case CC_D(CC_D(CC_D(_, _), CC_A(_, _)), CC_A(_, _)) => 6 
}
}