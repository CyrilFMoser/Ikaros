package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_B, c: T_B) extends T_A[Int, C]
case class CC_B[D](a: D) extends T_A[D, T_A[Int, T_A[(Char,Byte), (Int,Byte)]]]
case class CC_C[E]() extends T_A[T_A[T_A[T_B, (Int,Byte)], (Int,T_B)], E]
case class CC_D() extends T_B

val v_a: T_A[T_A[T_A[T_B, (Int,Byte)], (Int,T_B)], T_A[Int, T_A[(Char,Byte), (Int,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
}
}