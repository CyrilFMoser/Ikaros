package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (T_A[Int, Int],T_A[Byte, Char])) extends T_A[Boolean, T_A[T_A[Byte, Byte], T_A[Int, Int]]]
case class CC_B(a: T_A[CC_A, T_A[CC_A, CC_A]], b: (T_A[CC_A, (Byte,Byte)],Boolean), c: T_A[CC_A, Char]) extends T_A[Boolean, T_A[T_A[Byte, Byte], T_A[Int, Int]]]
case class CC_C() extends T_A[Boolean, T_A[T_A[Byte, Byte], T_A[Int, Int]]]

val v_a: T_A[Boolean, T_A[T_A[Byte, Byte], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}