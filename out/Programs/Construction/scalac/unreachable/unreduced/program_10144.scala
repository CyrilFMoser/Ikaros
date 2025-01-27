package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Byte,Boolean)]], b: Int, c: T_A[T_A[Char]]) extends T_A[T_A[(Int,Char)]]
case class CC_B[B](a: B) extends T_A[T_A[(Int,Char)]]

val v_a: T_A[T_A[(Int,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}