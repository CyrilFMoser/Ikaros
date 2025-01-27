package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[Boolean, Byte], T_A[Int, Char]]
case class CC_B[D, C](a: T_A[C, C], b: CC_A, c: T_A[C, C]) extends T_A[D, C]
case class CC_C(a: (CC_A,CC_A), b: T_A[Boolean, (Boolean,Boolean)], c: T_A[CC_A, CC_A]) extends T_A[T_A[Boolean, Byte], T_A[Int, Char]]

val v_a: CC_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
}
}