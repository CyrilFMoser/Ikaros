package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[Char, T_B]) extends T_A[T_A[T_B, Int], T_A[T_A[T_B, T_B], T_B]]
case class CC_B(a: CC_A, b: Char, c: T_B) extends T_B
case class CC_C[C]() extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), 'x', CC_B(_, _, _)) => 0 
  case CC_B(CC_A(_), _, CC_B(_, _, _)) => 1 
  case CC_B(CC_A(_), 'x', CC_C()) => 2 
  case CC_B(CC_A(_), _, CC_C()) => 3 
  case CC_B(CC_A(_), 'x', CC_D()) => 4 
  case CC_B(CC_A(_), _, CC_D()) => 5 
  case CC_C() => 6 
  case CC_D() => 7 
}
}