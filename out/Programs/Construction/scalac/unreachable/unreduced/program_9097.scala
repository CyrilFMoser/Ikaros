package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int, b: T_A[Byte]) extends T_A[T_A[((Char,Char),Boolean)]]
case class CC_B() extends T_A[T_A[((Char,Char),Boolean)]]

val v_a: T_A[T_A[((Char,Char),Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}