package Program_25 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: T_A[T_A[Boolean]], c: T_A[T_A[Int]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B() extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: CC_B, b: CC_A, c: CC_B) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(CC_B(), _, _) => 1 
}
}
// This is not matched: CC_B()