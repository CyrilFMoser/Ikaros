package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: (T_A[Byte, Char],Byte)) extends T_A[(T_A[Char, Boolean],(Byte,Char)), C]

val v_a: T_A[(T_A[Char, Boolean],(Byte,Char)), Int] = null
val v_b: Int = v_a match{
  case CC_A(12, (_,_)) => 0 
  case CC_A(_, (_,_)) => 1 
}
}