package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Char, (Boolean,Char)], b: Int) extends T_A[Boolean, T_A[Byte, Boolean]]

val v_a: T_A[Boolean, T_A[Byte, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_B Boolean (T_A Int Boolean))