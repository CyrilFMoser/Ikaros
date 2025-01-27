package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: Boolean) extends T_A[C, T_A[T_A[Byte, Int], (Byte,Boolean)]]
case class CC_B() extends T_A[Byte, CC_A[(Int,Int)]]
case class CC_C(a: CC_B) extends T_A[(CC_A[CC_B],CC_B), T_A[T_A[Byte, Int], (Byte,Boolean)]]

val v_a: T_A[(CC_A[CC_B],CC_B), T_A[T_A[Byte, Int], (Byte,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, true) => 0 
  case CC_A(_, _, false) => 1 
  case CC_C(CC_B()) => 2 
}
}