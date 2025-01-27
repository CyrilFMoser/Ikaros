package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Int], b: T_B[T_A[Int]]) extends T_A[T_A[(Byte,Boolean)]]
case class CC_B(a: (T_A[(Boolean,Boolean)],Char), b: CC_A, c: CC_A) extends T_A[T_A[(Byte,Boolean)]]
case class CC_C(a: T_A[CC_B], b: Byte) extends T_A[T_A[(Byte,Boolean)]]

val v_a: T_A[T_A[(Byte,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _), _) => 1 
  case CC_C(_, _) => 2 
}
}