package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[Int, T_A[Byte, Byte]], T_A[Byte, (Int,Char)]]
case class CC_B(a: T_A[T_A[CC_A, CC_A], (CC_A,CC_A)]) extends T_A[T_A[Int, T_A[Byte, Byte]], T_A[Byte, (Int,Char)]]

val v_a: T_A[T_A[Int, T_A[Byte, Byte]], T_A[Byte, (Int,Char)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}