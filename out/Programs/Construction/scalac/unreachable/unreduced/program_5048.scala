package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: CC_A, b: T_A[CC_A], c: CC_A) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: Boolean, b: CC_B) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
  case CC_C(_, CC_B(CC_A(), _, CC_A())) => 2 
}
}