package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean, b: Byte, c: T_A[T_A[Char]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B() extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B() => 2 
}
}