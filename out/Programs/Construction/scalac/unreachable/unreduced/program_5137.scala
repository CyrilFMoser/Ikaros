package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_A[CC_A[Char]], b: Boolean) extends T_A[T_A[T_A[Byte]]]
case class CC_C() extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()