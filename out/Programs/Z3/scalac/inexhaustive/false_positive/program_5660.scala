package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, D](a: Byte) extends T_A[D, E]

val v_a: CC_A[Int, T_A[T_A[(Char,Byte), (Int,Boolean)], (Int,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_B T_A)