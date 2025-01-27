package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[Byte], c: Int) extends T_A[T_A[Boolean]]
case class CC_B(a: T_A[CC_A], b: Boolean) extends T_A[T_A[Boolean]]
case class CC_C() extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(_, true) => 0 
  case CC_B(_, false) => 1 
  case CC_C() => 2 
}
}
// This is not matched: CC_A(_, _, _)