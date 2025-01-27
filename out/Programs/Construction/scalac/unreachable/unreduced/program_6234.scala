package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Boolean]], b: Int) extends T_A[T_B[T_A[Char]]]
case class CC_B() extends T_A[T_B[T_A[Char]]]
case class CC_C(a: T_B[T_B[Byte]], b: CC_B) extends T_A[T_B[T_A[Char]]]
case class CC_D(a: CC_C, b: CC_C) extends T_B[T_A[T_B[Int]]]
case class CC_E(a: T_B[T_B[CC_C]], b: CC_A, c: T_A[Boolean]) extends T_B[T_A[T_B[Int]]]

val v_a: T_A[T_B[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, CC_B())