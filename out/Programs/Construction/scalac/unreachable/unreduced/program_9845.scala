package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Boolean, Char],T_A[Boolean, Boolean])) extends T_A[T_A[(Int,Byte), (Byte,Byte)], C]
case class CC_B() extends T_A[T_A[(Int,Byte), (Byte,Byte)], T_A[T_A[Boolean, Byte], T_A[Byte, Boolean]]]

val v_a: T_A[T_A[(Int,Byte), (Byte,Byte)], T_A[T_A[Boolean, Byte], T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B() => 1 
}
}