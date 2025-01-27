package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_B() extends T_B
case class CC_C(a: T_A[CC_B], b: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, 'x') => 1 
  case CC_C(_, _) => 2 
}
}