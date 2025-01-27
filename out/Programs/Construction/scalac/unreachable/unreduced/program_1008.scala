package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Int, Byte]) extends T_A[T_A[T_A[(Byte,Boolean), Byte], T_A[Boolean, Char]], T_A[((Char,Int),Char), T_A[Boolean, Byte]]]
case class CC_B(a: (CC_A,CC_A), b: CC_A) extends T_A[T_A[T_A[(Byte,Boolean), Byte], T_A[Boolean, Char]], T_A[((Char,Int),Char), T_A[Boolean, Byte]]]

val v_a: T_A[T_A[T_A[(Byte,Boolean), Byte], T_A[Boolean, Char]], T_A[((Char,Int),Char), T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,_), _) => 1 
}
}