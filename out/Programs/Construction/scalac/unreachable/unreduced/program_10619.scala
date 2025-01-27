package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_B[Char, Byte],T_B[Byte, Int]), b: T_B[T_A[Char], T_A[Boolean]], c: ((Char,Char),T_A[Char])) extends T_A[(T_B[Int, Boolean],T_A[Boolean])]
case class CC_B(a: CC_A, b: T_A[Byte]) extends T_B[(T_A[Char],T_A[CC_A]), (CC_A,T_B[CC_A, Byte])]
case class CC_C() extends T_B[(T_A[Char],T_A[CC_A]), (CC_A,T_B[CC_A, Byte])]
case class CC_D(a: CC_B) extends T_B[(T_A[Char],T_A[CC_A]), (CC_A,T_B[CC_A, Byte])]

val v_a: T_B[(T_A[Char],T_A[CC_A]), (CC_A,T_B[CC_A, Byte])] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _) => 0 
  case CC_C() => 1 
  case CC_D(_) => 2 
}
}