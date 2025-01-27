package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: Boolean) extends T_A[Char]
case class CC_B(a: Boolean, b: Boolean, c: T_A[Char]) extends T_A[Char]
case class CC_C(a: T_A[T_A[Boolean]], b: T_A[CC_A]) extends T_A[Char]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(_, _)) => 0 
  case CC_B(_, _, CC_B(_, true, _)) => 1 
  case CC_B(_, _, CC_B(_, false, _)) => 2 
  case CC_B(_, _, CC_C(_, _)) => 3 
}
}