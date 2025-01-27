package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[(Byte,Byte), C], C]
case class CC_B[D](a: Int) extends T_A[T_A[(Byte,Byte), D], D]

val v_a: T_A[T_A[(Byte,Byte), Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(12) => 1 
  case CC_B(_) => 2 
}
}