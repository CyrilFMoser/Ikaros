package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (Int,Char)) extends T_A[T_B[T_A[(Boolean,Char)], T_B[Byte, Char]]]
case class CC_B(a: T_A[T_B[CC_A, CC_A]], b: Boolean) extends T_A[T_B[T_A[(Boolean,Char)], T_B[Byte, Char]]]
case class CC_C[D](a: D, b: T_A[D], c: CC_B) extends T_B[D, Boolean]

val v_a: T_A[T_B[T_A[(Boolean,Char)], T_B[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, true) => 1 
  case CC_B(_, false) => 2 
}
}