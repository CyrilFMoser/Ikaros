package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: T_A[T_A[Char]], c: T_A[T_A[Byte]]) extends T_A[T_A[((Int,Char),(Byte,Boolean))]]
case class CC_B() extends T_A[T_A[((Int,Char),(Byte,Boolean))]]

val v_a: T_A[T_A[((Int,Char),(Byte,Boolean))]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}