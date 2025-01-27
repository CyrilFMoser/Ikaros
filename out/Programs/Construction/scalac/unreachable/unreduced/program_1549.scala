package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte) extends T_A[(T_A[Char, (Char,Boolean)],T_A[Byte, (Char,Byte)]), C]
case class CC_B(a: ((Boolean,Int),T_A[Char, Char])) extends T_A[(T_A[Char, (Char,Boolean)],T_A[Byte, (Char,Byte)]), T_A[T_A[Boolean, Char], T_A[Int, Boolean]]]

val v_a: T_A[(T_A[Char, (Char,Boolean)],T_A[Byte, (Char,Byte)]), T_A[T_A[Boolean, Char], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,_)) => 1 
}
}