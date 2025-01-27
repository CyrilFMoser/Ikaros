package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Byte, b: T_B) extends T_A[T_A[Boolean]]
case class CC_B(a: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_C(a: T_A[CC_B], b: CC_B, c: CC_A) extends T_A[T_A[Boolean]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
  case CC_B(CC_B(CC_A(_, _))) => 1 
  case CC_B(CC_B(CC_B(_))) => 2 
  case CC_B(CC_B(CC_C(_, _, _))) => 3 
  case CC_B(CC_C(_, _, CC_A(_, _))) => 4 
}
}