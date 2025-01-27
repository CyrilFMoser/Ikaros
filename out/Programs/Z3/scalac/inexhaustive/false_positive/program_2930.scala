package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: Int) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_C T_A Wildcard T_A)