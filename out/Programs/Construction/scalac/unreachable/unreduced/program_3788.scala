package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A(a: ((Int,Int),T_A[Byte]), b: T_A[T_A[Char]]) extends T_A[T_A[(Int,Char)]]
case class CC_B(a: Byte) extends T_A[T_A[(Int,Char)]]

val v_a: T_A[T_A[(Int,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}