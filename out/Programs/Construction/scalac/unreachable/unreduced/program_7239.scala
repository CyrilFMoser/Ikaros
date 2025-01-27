package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: C) extends T_A[C, T_B]
case class CC_B() extends T_B
case class CC_C(a: T_A[Int, CC_B], b: Boolean, c: Char) extends T_B
case class CC_D(a: CC_A[T_A[Int, T_B]], b: T_A[CC_B, T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, true, 'x') => 1 
  case CC_C(_, false, 'x') => 2 
  case CC_C(_, true, _) => 3 
  case CC_C(_, false, _) => 4 
}
}
// This is not matched: CC_D(_, CC_A(CC_B(), _))