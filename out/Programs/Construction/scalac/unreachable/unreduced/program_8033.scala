package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_A[T_A[Int]]) extends T_A[T_A[T_A[Byte]]]
case class CC_C() extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_)