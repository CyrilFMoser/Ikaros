package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_A[Int]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: CC_B, b: T_A[(CC_B,CC_B)], c: CC_A) extends T_A[T_A[T_A[Int]]]
case class CC_D[C](a: CC_B) extends T_B[C]
case class CC_E[D](a: Byte, b: Boolean, c: CC_C) extends T_B[D]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(CC_A())