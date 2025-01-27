package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Byte]], b: Char, c: T_A[T_A[Byte]]) extends T_A[T_B[T_B[Byte]]]
case class CC_B() extends T_A[T_B[T_B[Byte]]]
case class CC_C(a: T_B[T_B[Byte]]) extends T_A[T_B[T_B[Byte]]]

val v_a: T_A[T_B[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}