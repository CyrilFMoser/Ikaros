package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Int,Boolean), Int], b: Char) extends T_A[Boolean, (Int,Char)]

val v_a: T_A[Boolean, (Int,Char)] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: (CC_C Char (T_B Char Boolean))