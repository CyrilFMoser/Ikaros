package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (Byte,T_A[Boolean])) extends T_A[T_B[T_B[Int, Byte], T_A[Int]]]
case class CC_B(a: T_B[CC_A, T_A[(Char,Byte)]]) extends T_A[T_B[T_B[Int, Byte], T_A[Int]]]
case class CC_C(a: Boolean) extends T_A[T_B[T_B[Int, Byte], T_A[Int]]]
case class CC_D(a: T_B[Byte, CC_C], b: CC_A) extends T_B[Byte, T_A[Int]]
case class CC_E[D](a: CC_A, b: D, c: T_B[D, CC_A]) extends T_B[D, CC_A]

val v_a: T_A[T_B[T_B[Int, Byte], T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(_)