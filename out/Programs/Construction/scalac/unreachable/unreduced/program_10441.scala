package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Byte, Int]], b: Char) extends T_A[T_B[T_B[(Char,Byte), (Int,Char)], T_A[(Int,Boolean)]]]
case class CC_B(a: CC_A, b: Boolean, c: Byte) extends T_A[T_B[T_B[(Char,Byte), (Int,Char)], T_A[(Int,Boolean)]]]

val v_a: T_A[T_B[T_B[(Char,Byte), (Int,Char)], T_A[(Int,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, 0) => 1 
}
}
// This is not matched: CC_B(_, _, _)