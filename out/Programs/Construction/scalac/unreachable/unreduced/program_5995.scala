package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C, c: T_A[C, C]) extends T_A[C, T_A[T_A[Boolean, Byte], T_A[Int, Int]]]
case class CC_B[D](a: T_A[D, D], b: D) extends T_A[D, T_A[T_A[Boolean, Byte], T_A[Int, Int]]]
case class CC_C(a: CC_B[CC_A[Boolean]], b: Char, c: Byte) extends T_A[CC_B[CC_A[Int]], T_A[T_A[Boolean, Byte], T_A[Int, Int]]]

val v_a: T_A[CC_B[CC_A[Int]], T_A[T_A[Boolean, Byte], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_B(_, CC_A(_, _, _))) => 1 
  case CC_C(_, _, _) => 2 
}
}