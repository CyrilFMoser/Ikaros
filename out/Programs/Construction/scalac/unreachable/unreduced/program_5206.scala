package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Int) extends T_A[((Char,Char),T_A[Char, Char]), T_A[T_A[Char, Int], T_A[Byte, (Byte,Int)]]]
case class CC_B(a: T_A[Char, T_A[CC_A, CC_A]], b: Byte, c: CC_A) extends T_A[((Char,Char),T_A[Char, Char]), T_A[T_A[Char, Int], T_A[Byte, (Byte,Int)]]]

val v_a: T_A[((Char,Char),T_A[Char, Char]), T_A[T_A[Char, Int], T_A[Byte, (Byte,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, CC_A(_)) => 1 
}
}