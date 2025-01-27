package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[T_A[C, C], C], c: Byte) extends T_A[T_A[Char, (Char,Byte)], C]
case class CC_B[D]() extends T_A[T_A[Char, (Char,Byte)], D]

val v_a: T_A[T_A[Char, (Char,Byte)], Char] = null
val v_b: Int = v_a match{
  case CC_A('x', _, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B() => 2 
}
}