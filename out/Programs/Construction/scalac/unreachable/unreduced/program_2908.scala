package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[(T_A[Byte, (Char,Char)],T_A[Byte, Int]), C]
case class CC_B[D](a: (T_A[Int, Int],T_A[Char, Int]), b: T_A[D, CC_A[D]], c: (Int,T_A[Char, Boolean])) extends T_A[(T_A[Byte, (Char,Char)],T_A[Byte, Int]), D]

val v_a: T_A[(T_A[Byte, (Char,Char)],T_A[Byte, Int]), Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}