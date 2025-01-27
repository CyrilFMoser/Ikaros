package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[Char, T_A[Int, Boolean]], C]
case class CC_B(a: Int, b: ((Byte,Byte),Boolean)) extends T_A[T_A[Char, T_A[Int, Boolean]], (T_A[Boolean, Char],CC_A[Byte])]

val v_a: T_A[T_A[Char, T_A[Int, Boolean]], (T_A[Boolean, Char],CC_A[Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(12, ((_,_),true)) => 1 
  case CC_B(_, ((_,_),true)) => 2 
  case CC_B(12, ((_,_),false)) => 3 
  case CC_B(_, ((_,_),false)) => 4 
}
}