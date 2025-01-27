package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[T_A[Int, Char], ((Boolean,Byte),Byte)], C]
case class CC_B[D](a: Boolean) extends T_A[T_A[T_A[Int, Char], ((Boolean,Byte),Byte)], D]
case class CC_C[E]() extends T_A[T_A[T_A[Int, Char], ((Boolean,Byte),Byte)], E]

val v_a: T_A[T_A[T_A[Int, Char], ((Boolean,Byte),Byte)], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}