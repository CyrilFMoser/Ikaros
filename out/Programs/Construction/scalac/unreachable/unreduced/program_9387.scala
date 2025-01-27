package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_A[Int]]]
case class CC_B(a: T_B[(CC_A,Int), (CC_A,CC_A)]) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: T_B[T_A[CC_B], CC_A]) extends T_A[T_A[T_A[Int]]]
case class CC_D[D](a: (CC_C,CC_B), b: Byte) extends T_B[Byte, D]
case class CC_E(a: CC_D[CC_D[CC_A]], b: CC_C, c: CC_D[T_B[CC_C, CC_C]]) extends T_B[Byte, CC_B]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_)