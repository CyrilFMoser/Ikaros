package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[T_A[Int, Byte], T_A[Byte, (Boolean,Byte)]]]
case class CC_B[D](a: CC_A[D]) extends T_A[D, T_A[T_A[Int, Byte], T_A[Byte, (Boolean,Byte)]]]

val v_a: T_A[Int, T_A[T_A[Int, Byte], T_A[Byte, (Boolean,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}