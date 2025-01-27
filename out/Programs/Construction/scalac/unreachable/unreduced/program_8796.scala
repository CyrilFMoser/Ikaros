package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Byte]], b: T_B[T_A[Char]], c: T_B[T_B[Boolean]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B() extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: CC_A) extends T_B[T_B[T_B[Char]]]
case class CC_D(a: T_B[(CC_B,CC_C)]) extends T_B[T_B[T_B[Char]]]
case class CC_E(a: Byte, b: CC_B, c: CC_A) extends T_B[T_B[T_B[Char]]]

val v_a: T_B[T_B[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_E(_, _, CC_A(_, _, _))