package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Byte], b: T_A[T_B[Char]], c: T_B[Boolean]) extends T_A[T_A[T_B[Char]]]
case class CC_B() extends T_A[T_A[T_B[Char]]]

val v_a: T_A[T_A[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}