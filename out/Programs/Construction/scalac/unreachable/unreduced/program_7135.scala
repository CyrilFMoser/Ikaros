package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Char,Int), T_A[Boolean, Byte]], b: (T_A[Byte, Boolean],T_A[Char, (Char,Char)]), c: T_A[T_A[Int, Byte], T_A[Byte, Byte]]) extends T_A[Boolean, T_A[T_A[(Byte,Char), Byte], T_A[Int, Char]]]
case class CC_B() extends T_A[Boolean, T_A[T_A[(Byte,Char), Byte], T_A[Int, Char]]]

val v_a: T_A[Boolean, T_A[T_A[(Byte,Char), Byte], T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B() => 1 
}
}