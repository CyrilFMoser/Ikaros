package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_A[Int]]]
case class CC_B(a: T_B[T_A[CC_A]], b: T_A[Byte], c: CC_A) extends T_A[T_A[T_A[Int]]]
case class CC_C() extends T_A[T_A[T_A[Int]]]
case class CC_D[C](a: (CC_A,CC_B), b: C, c: CC_B) extends T_B[C]
case class CC_E(a: CC_D[CC_A], b: T_B[T_B[Int]]) extends T_B[Int]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()