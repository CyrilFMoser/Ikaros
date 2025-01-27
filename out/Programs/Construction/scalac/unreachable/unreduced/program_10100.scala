package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[Char], c: T_A[Char]) extends T_A[Char]
case class CC_B(a: T_A[Char]) extends T_A[Char]
case class CC_C() extends T_B
case class CC_D(a: T_A[T_A[CC_B]], b: Char) extends T_B

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(CC_C(), _, CC_A(_, _, CC_B(_))) => 1 
  case CC_A(CC_C(), _, CC_B(CC_A(_, _, _))) => 2 
  case CC_A(CC_C(), _, CC_B(CC_B(_))) => 3 
  case CC_A(CC_D(_, _), _, CC_A(_, _, CC_A(_, _, _))) => 4 
  case CC_A(CC_D(_, _), _, CC_A(_, _, CC_B(_))) => 5 
  case CC_A(CC_D(_, _), _, CC_B(CC_A(_, _, _))) => 6 
  case CC_A(CC_D(_, _), _, CC_B(CC_B(_))) => 7 
  case CC_B(_) => 8 
}
}