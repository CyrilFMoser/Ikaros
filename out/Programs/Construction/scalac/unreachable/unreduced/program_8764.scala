package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Int,T_A[Byte, Char])) extends T_A[C, T_A[C, T_A[C, C]]]
case class CC_B[D](a: CC_A[D], b: T_A[D, D], c: D) extends T_A[(T_A[(Boolean,Boolean), Byte],CC_A[Byte]), T_A[(T_A[(Boolean,Boolean), Byte],CC_A[Byte]), T_A[(T_A[(Boolean,Boolean), Byte],CC_A[Byte]), (T_A[(Boolean,Boolean), Byte],CC_A[Byte])]]]

val v_a: T_A[(T_A[(Boolean,Boolean), Byte],CC_A[Byte]), T_A[(T_A[(Boolean,Boolean), Byte],CC_A[Byte]), T_A[(T_A[(Boolean,Boolean), Byte],CC_A[Byte]), (T_A[(Boolean,Boolean), Byte],CC_A[Byte])]]] = null
val v_b: Int = v_a match{
  case CC_A((12,_)) => 0 
  case CC_A((_,_)) => 1 
  case CC_B(_, _, _) => 2 
}
}