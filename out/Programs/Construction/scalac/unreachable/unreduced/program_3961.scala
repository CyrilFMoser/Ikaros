package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Byte, Boolean], b: Int) extends T_A[(Char,T_A[Char, Int]), (T_A[Int, Char],T_A[Byte, (Byte,Byte)])]
case class CC_B() extends T_A[(Char,T_A[Char, Int]), (T_A[Int, Char],T_A[Byte, (Byte,Byte)])]

val v_a: T_A[(Char,T_A[Char, Int]), (T_A[Int, Char],T_A[Byte, (Byte,Byte)])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}