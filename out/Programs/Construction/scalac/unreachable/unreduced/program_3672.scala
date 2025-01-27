package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: T_A[Int, C], c: (Byte,T_A[Byte, Int])) extends T_A[Byte, C]
case class CC_B[D]() extends T_A[Byte, D]
case class CC_C[E](a: CC_A[E], b: (T_A[Byte, Byte],(Char,Byte)), c: (T_A[Boolean, Char],CC_B[Boolean])) extends T_A[Byte, E]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, (CC_A(_, _, _),(_,_)), _) => 2 
  case CC_C(_, (CC_B(),(_,_)), _) => 3 
  case CC_C(_, (CC_C(_, _, _),(_,_)), _) => 4 
}
}