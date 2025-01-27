package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[(T_A[(Char,Int), Int],T_A[Byte, Char]), C]
case class CC_B[D]() extends T_A[(T_A[(Char,Int), Int],T_A[Byte, Char]), D]
case class CC_C(a: T_A[(Char,Char), CC_A[(Boolean,Int)]]) extends T_A[(T_A[(Char,Int), Int],T_A[Byte, Char]), CC_A[CC_B[Char]]]

val v_a: T_A[(T_A[(Char,Int), Int],T_A[Byte, Char]), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}