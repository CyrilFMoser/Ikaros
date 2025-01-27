package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[T_A[Int]], c: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: CC_A, b: Byte) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: CC_A, b: (CC_B,CC_A), c: T_A[CC_A]) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(CC_A(_, _, _), (CC_B(_, _),CC_A(_, _, _)), _)