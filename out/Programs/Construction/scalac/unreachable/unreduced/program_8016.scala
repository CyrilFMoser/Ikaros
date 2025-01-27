package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: (T_A[Char, Int],(Byte,Char)), b: (Int,T_A[Boolean, Byte])) extends T_A[C, T_A[T_A[(Int,Char), Int], T_A[Byte, Int]]]
case class CC_B[E]() extends T_A[E, T_A[T_A[(Int,Char), Int], T_A[Byte, Int]]]
case class CC_C(a: T_A[Boolean, T_A[Byte, Boolean]], b: CC_B[CC_A[Boolean, Char]]) extends T_A[CC_B[CC_B[Char]], T_A[T_A[(Int,Char), Int], T_A[Byte, Int]]]

val v_a: T_A[CC_C, T_A[T_A[(Int,Char), Int], T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_)), (12,_)) => 0 
  case CC_A((_,(_,_)), (_,_)) => 1 
  case CC_B() => 2 
}
}