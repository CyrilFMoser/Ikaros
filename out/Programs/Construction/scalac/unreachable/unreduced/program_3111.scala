package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[Byte]) extends T_A[T_A[(Byte,Int)]]
case class CC_B() extends T_A[T_A[(Byte,Int)]]

val v_a: T_A[T_A[(Byte,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}