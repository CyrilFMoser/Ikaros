package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Int,Boolean), b: T_A[Boolean]) extends T_A[T_A[(Int,Byte)]]
case class CC_B(a: CC_A) extends T_A[T_A[(Int,Byte)]]

val v_a: T_A[T_A[(Int,Byte)]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A((12,_), _)) => 0 
  case CC_A(_, _) => 1 
}
}
// This is not matched: (CC_B T_A)