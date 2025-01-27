package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (T_A[Char, Int],T_A[Int, Boolean]), b: (T_A[Char, Char],Byte), c: T_A[T_A[Int, Int], T_A[Byte, Char]]) extends T_A[Byte, T_A[T_A[Boolean, Char], T_A[Boolean, Byte]]]
case class CC_B(a: (T_A[CC_A, CC_A],T_A[CC_A, CC_A])) extends T_A[Byte, T_A[T_A[Boolean, Char], T_A[Boolean, Byte]]]
case class CC_C() extends T_A[Byte, T_A[T_A[Boolean, Char], T_A[Boolean, Byte]]]

val v_a: T_A[Byte, T_A[T_A[Boolean, Char], T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B((_,_)) => 1 
  case CC_C() => 2 
}
}