package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Int, b: T_A[T_B[Byte, Byte]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: Boolean, b: (CC_A,(CC_A,CC_A)), c: T_A[CC_A]) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: T_B[CC_A, T_A[CC_B]]) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_, (CC_A(_, _),(_,_)), _)