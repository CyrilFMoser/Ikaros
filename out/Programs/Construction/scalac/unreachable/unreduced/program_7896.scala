package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[Char], c: T_A[(Boolean,Byte)]) extends T_A[T_A[(Char,Boolean)]]
case class CC_B() extends T_A[T_A[(Char,Boolean)]]

val v_a: T_A[T_A[(Char,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}