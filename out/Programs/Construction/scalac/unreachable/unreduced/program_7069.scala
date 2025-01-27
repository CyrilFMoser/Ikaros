package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Byte, b: ((Boolean,Char),T_A[Byte, Byte])) extends T_A[T_A[(Byte,Int), T_A[(Byte,Byte), (Int,Boolean)]], C]
case class CC_B() extends T_A[T_A[(Byte,Int), T_A[(Byte,Byte), (Int,Boolean)]], T_A[T_A[Boolean, Boolean], T_A[Boolean, Char]]]
case class CC_C[E](a: Boolean, b: T_A[E, E]) extends T_A[T_A[CC_B, CC_A[Byte, CC_B]], E]

val v_a: T_A[T_A[(Byte,Int), T_A[(Byte,Byte), (Int,Boolean)]], T_A[T_A[Boolean, Boolean], T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(0, ((_,_),_)) => 0 
  case CC_A(_, ((_,_),_)) => 1 
  case CC_B() => 2 
}
}