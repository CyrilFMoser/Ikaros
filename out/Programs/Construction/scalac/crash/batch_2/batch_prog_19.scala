package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (T_A[Boolean, Char],T_A[Char, Int]), b: Char, c: Char) extends T_A[T_A[T_A[Char, Int], T_A[Byte, Int]], T_A[T_A[Int, Byte], T_A[(Char,Int), Char]]]
case class CC_B() extends T_A[T_A[T_A[Char, Int], T_A[Byte, Int]], T_A[T_A[Int, Byte], T_A[(Char,Int), Char]]]
case class CC_C(a: Int, b: (Byte,T_A[CC_A, CC_B])) extends T_A[T_A[T_A[Char, Int], T_A[Byte, Int]], T_A[T_A[Int, Byte], T_A[(Char,Int), Char]]]

val v_a: T_A[T_A[T_A[Char, Int], T_A[Byte, Int]], T_A[T_A[Int, Byte], T_A[(Char,Int), Char]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), 'x', _) => 0 
  case CC_A((_,_), _, _) => 1 
  case CC_B() => 2 
  case CC_C(_, _) => 3 
}
}