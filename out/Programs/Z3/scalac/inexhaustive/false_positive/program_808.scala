package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: (Int,Byte)) extends T_A[T_A[(Char,Boolean)]]

val v_a: T_A[T_A[(Char,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,0)) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)