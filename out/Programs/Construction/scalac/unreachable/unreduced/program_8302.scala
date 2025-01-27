package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Char,Int), b: Byte, c: T_A[T_A[Char]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B() extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: Char) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C('x') => 2 
}
}
// This is not matched: CC_C(_)