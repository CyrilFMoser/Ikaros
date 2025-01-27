package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: T_A[C, C], c: Char) extends T_A[C, T_A[C, C]]
case class CC_B(a: CC_A[CC_A[Boolean]], b: Char) extends T_A[Char, T_A[Char, Char]]
case class CC_C() extends T_A[Char, T_A[Char, Char]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(_, _), _, _) => 1 
  case CC_A(CC_C(), _, _) => 2 
  case CC_B(_, 'x') => 3 
  case CC_B(_, _) => 4 
  case CC_C() => 5 
}
}