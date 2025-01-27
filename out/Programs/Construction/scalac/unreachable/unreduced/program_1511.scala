package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Boolean], T_A[Boolean, (Char,Byte)]], b: Boolean, c: T_A[T_A[Char, Boolean], T_A[(Int,Byte), Byte]]) extends T_A[T_A[(Char,Char), T_A[Boolean, Char]], T_A[((Byte,Char),Int), T_A[Char, Byte]]]
case class CC_B(a: (CC_A,T_A[CC_A, (Boolean,Boolean)])) extends T_A[T_A[(Char,Char), T_A[Boolean, Char]], T_A[((Byte,Char),Int), T_A[Char, Byte]]]
case class CC_C() extends T_A[T_A[(Char,Char), T_A[Boolean, Char]], T_A[((Byte,Char),Int), T_A[Char, Byte]]]

val v_a: T_A[T_A[(Char,Char), T_A[Boolean, Char]], T_A[((Byte,Char),Int), T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((_,_)) => 1 
  case CC_C() => 2 
}
}