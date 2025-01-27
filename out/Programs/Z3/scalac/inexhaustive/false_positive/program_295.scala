package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[Byte]]
case class CC_B(a: T_A[CC_A], b: Byte) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, 0) => 1 
}
}
// This is not matched: (CC_C T_A Wildcard (T_B T_A))