package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[(Char,Byte), Char], T_A[Char, Boolean]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[(Char,Byte), Char], T_A[Char, Boolean]]]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}