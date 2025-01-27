package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Int, b: T_A[T_A[Char]], c: T_A[Char]) extends T_A[Char]
case class CC_B() extends T_A[(CC_A,T_A[Char])]
case class CC_C(a: Byte, b: ((CC_B,(Byte,Boolean)),(CC_B,Char)), c: Byte) extends T_A[Char]
case class CC_D[D, E]() extends T_B[D, E]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_C(_, _, _)) => 1 
  case CC_C(_, _, _) => 2 
}
}