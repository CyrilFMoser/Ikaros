package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Char]]) extends T_A[T_B[T_A[Byte]]]
case class CC_B(a: Boolean, b: T_A[T_A[CC_A]], c: T_B[T_B[CC_A]]) extends T_B[T_B[T_B[CC_A]]]
case class CC_C(a: T_A[Int]) extends T_B[T_B[T_B[CC_A]]]
case class CC_D[C](a: CC_A, b: (CC_A,CC_C)) extends T_B[T_B[T_B[CC_A]]]

val v_a: T_B[T_B[T_B[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_C(_)