package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: Byte, b: T_A[Boolean], c: T_A[CC_B]) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
  case CC_C(_, _, _) => 2 
}
}