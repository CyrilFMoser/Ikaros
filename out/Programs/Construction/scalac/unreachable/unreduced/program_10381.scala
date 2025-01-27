package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: ((Byte,Int),T_A[Byte, Char]), b: T_A[C, C], c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[(Byte,Byte), T_A[Byte, Char]]]
case class CC_B() extends T_A[(CC_A[Byte],CC_A[Byte]), T_A[(Byte,Byte), T_A[Byte, Char]]]
case class CC_C(a: CC_B, b: T_A[T_A[CC_B, CC_B], Char], c: Char) extends T_A[(CC_A[Byte],CC_A[Byte]), T_A[(Byte,Byte), T_A[Byte, Char]]]

val v_a: T_A[(CC_A[Byte],CC_A[Byte]), T_A[(Byte,Byte), T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}