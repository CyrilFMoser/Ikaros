package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B(a: (CC_A[Boolean],T_A[Byte, Char]), b: T_A[T_A[(Byte,Int), (Byte,Int)], (Byte,Int)], c: T_A[T_A[T_A[Boolean, Char], T_A[Boolean, Char]], T_A[Boolean, Char]]) extends T_A[T_A[T_A[T_A[T_A[Byte, Byte], T_A[Byte, Byte]], T_A[Byte, Byte]], T_A[T_A[T_A[Byte, Byte], T_A[Byte, Byte]], T_A[Byte, Byte]]], T_A[T_A[T_A[Byte, Byte], T_A[Byte, Byte]], T_A[Byte, Byte]]]

val v_a: T_A[T_A[T_A[T_A[T_A[Byte, Byte], T_A[Byte, Byte]], T_A[Byte, Byte]], T_A[T_A[T_A[Byte, Byte], T_A[Byte, Byte]], T_A[Byte, Byte]]], T_A[T_A[T_A[Byte, Byte], T_A[Byte, Byte]], T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_B((_,_), CC_A(_), CC_A(_))) => 2 
  case CC_B((CC_A(_),_), CC_A(CC_A(_)), CC_A(_)) => 3 
}
}