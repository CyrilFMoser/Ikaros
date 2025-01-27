package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[Byte]]
case class CC_B(a: Byte, b: T_A[T_A[CC_A]]) extends T_A[T_A[Byte]]
case class CC_C[B](a: T_A[B], b: CC_A, c: B) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}