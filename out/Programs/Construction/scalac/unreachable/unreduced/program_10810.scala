package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B() extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: Char, b: Byte, c: CC_A) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}