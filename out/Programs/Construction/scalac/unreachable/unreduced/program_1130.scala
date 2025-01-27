package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_B[Byte, Byte], T_A[Int]]]
case class CC_B(a: T_A[T_A[CC_A]]) extends T_A[T_B[T_B[Byte, Byte], T_A[Int]]]
case class CC_C(a: T_A[Int]) extends T_A[T_B[T_B[Byte, Byte], T_A[Int]]]
case class CC_D[D](a: Byte, b: Boolean, c: D) extends T_B[D, T_A[D]]

val v_a: T_A[T_B[T_B[Byte, Byte], T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(_)