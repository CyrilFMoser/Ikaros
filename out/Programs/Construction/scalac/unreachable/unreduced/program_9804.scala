package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[Char]], c: T_A[T_A[Byte]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: T_A[CC_A]) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: (CC_B,Boolean)) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_, _, _)