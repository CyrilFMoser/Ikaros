package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Int, Char], b: (Byte,Char)) extends T_A[Char, T_A[Char, Boolean]]

val v_a: T_A[Char, T_A[Char, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, (0,_)) => 0 
}
}
// This is not matched: (CC_C T_B)