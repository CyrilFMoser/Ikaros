package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[Boolean]]
case class CC_B(a: T_A[Int], b: Char) extends T_A[T_A[CC_A]]

val v_a: T_A[T_A[CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(_, 'x') => 0 
}
}
// This is not matched: (CC_A T_B Wildcard Wildcard Wildcard (T_A T_B (T_A T_B T_B)))