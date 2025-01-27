package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B, T_B], Char], b: T_A[((Char,Boolean),Boolean), Int], c: Byte) extends T_A[Boolean, T_A[T_A[Byte, T_B], (T_B,(Char,Boolean))]]
case class CC_B() extends T_A[Boolean, T_A[T_A[Byte, T_B], (T_B,(Char,Boolean))]]
case class CC_C(a: (T_A[CC_A, CC_B],Char)) extends T_B

val v_a: T_A[Boolean, T_A[T_A[Byte, T_B], (T_B,(Char,Boolean))]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}