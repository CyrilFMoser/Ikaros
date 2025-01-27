package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Char], b: Byte) extends T_A[T_A[Boolean]]
case class CC_B(a: Boolean, b: T_A[T_A[Boolean]], c: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(true, _, CC_A(_, 0)) => 1 
  case CC_B(true, _, CC_A(_, _)) => 2 
  case CC_B(true, _, CC_B(_, _, _)) => 3 
  case CC_B(false, _, CC_A(_, 0)) => 4 
  case CC_B(false, _, CC_A(_, _)) => 5 
  case CC_B(false, _, CC_B(_, _, _)) => 6 
}
}