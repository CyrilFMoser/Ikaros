package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char, b: T_B[T_A[Boolean]], c: T_A[T_A[Boolean]]) extends T_A[T_A[T_B[Byte]]]
case class CC_B() extends T_A[T_A[T_B[Byte]]]

val v_a: T_A[T_A[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}