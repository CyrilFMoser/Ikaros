package Program_21 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_B(a: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_C(a: T_A[T_A[CC_A]], b: CC_A, c: CC_A) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_)) => 1 
  case CC_A(CC_C(_, _, _)) => 2 
  case CC_B(CC_A(_)) => 3 
  case CC_B(CC_B(_)) => 4 
  case CC_B(CC_C(_, _, _)) => 5 
  case CC_C(_, _, CC_A(_)) => 6 
}
}