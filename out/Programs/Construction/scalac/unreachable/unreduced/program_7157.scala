package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Char,T_A[Byte, Int]), b: Byte, c: (T_A[Boolean, (Byte,Int)],Byte)) extends T_A[C, T_A[T_A[Byte, Byte], T_A[Boolean, Int]]]
case class CC_B[D](a: (T_A[Boolean, Char],T_A[Char, (Char,Byte)]), b: (T_A[Char, (Int,Int)],CC_A[Int])) extends T_A[D, T_A[T_A[Byte, Byte], T_A[Boolean, Int]]]

val v_a: T_A[Int, T_A[T_A[Byte, Byte], T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, (_,_)) => 0 
  case CC_B(_, _) => 1 
}
}