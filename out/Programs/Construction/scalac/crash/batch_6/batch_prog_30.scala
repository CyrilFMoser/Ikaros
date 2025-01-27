package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[(Int,Byte), (Boolean,Byte)], C]

val v_a: T_A[T_A[(Int,Byte), (Boolean,Byte)], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}