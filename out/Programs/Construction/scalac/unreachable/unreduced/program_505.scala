package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_B[C], c: T_B[C]) extends T_A[C]
case class CC_B(a: T_B[Int], b: T_B[(Char,Boolean)], c: T_A[T_A[Int]]) extends T_A[T_B[(Boolean,Char)]]
case class CC_C(a: CC_B, b: CC_A[T_B[CC_B]]) extends T_B[T_A[T_B[CC_B]]]
case class CC_D() extends T_B[T_A[T_B[CC_B]]]
case class CC_E(a: T_A[Boolean], b: (CC_B,Int), c: CC_A[CC_B]) extends T_B[T_A[T_B[CC_B]]]

val v_a: T_B[T_A[T_B[CC_B]]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_A(_, _, _), _, _) => 1 
}
}
// This is not matched: CC_C(_, _)