package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Int, Boolean], T_A[Int, Boolean]], T_A[Int, (Byte,Byte)]]
case class CC_B[C](a: T_A[C, C], b: C, c: T_A[C, C]) extends T_A[T_A[T_A[Int, Boolean], T_A[Int, Boolean]], T_A[Int, (Byte,Byte)]]
case class CC_C(a: CC_B[CC_B[CC_A]], b: T_A[Int, CC_B[CC_A]]) extends T_A[T_A[T_A[Int, Boolean], T_A[Int, Boolean]], T_A[Int, (Byte,Byte)]]

val v_a: T_A[T_A[T_A[Int, Boolean], T_A[Int, Boolean]], T_A[Int, (Byte,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}