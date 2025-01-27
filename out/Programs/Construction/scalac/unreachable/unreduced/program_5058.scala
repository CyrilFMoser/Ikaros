package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Boolean) extends T_A[T_B[T_A[Boolean]]]
case class CC_B(a: T_B[T_B[Byte]], b: CC_A) extends T_A[T_B[T_A[Boolean]]]
case class CC_C() extends T_B[(Byte,CC_A)]

val v_a: T_A[T_B[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(true) => 0 
  case CC_A(false) => 1 
  case CC_B(_, CC_A(_)) => 2 
}
}