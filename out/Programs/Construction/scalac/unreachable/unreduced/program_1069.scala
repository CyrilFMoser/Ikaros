package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int) extends T_A[T_A[(Boolean,Char)]]
case class CC_B(a: Boolean, b: T_A[T_A[(Boolean,Byte)]], c: T_A[Char]) extends T_A[T_A[(Boolean,Char)]]

val v_a: T_A[T_A[(Boolean,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}