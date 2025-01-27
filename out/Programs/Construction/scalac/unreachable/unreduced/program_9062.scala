package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[T_A[C, C], C], c: C) extends T_A[C, T_A[C, C]]
case class CC_B(a: (T_A[Char, T_B],(Int,T_B)), b: T_A[CC_A[(Byte,Int)], T_B]) extends T_B
case class CC_C(a: Int, b: ((CC_B,T_B),(T_B,T_B)), c: T_A[T_A[Char, T_B], T_A[T_A[Char, T_B], T_A[Char, T_B]]]) extends T_B
case class CC_D(a: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B((_,(_,_)), _) => 0 
  case CC_C(_, ((_,_),(_,_)), CC_A(CC_B(_, _), _, _)) => 1 
  case CC_C(_, ((_,_),(_,_)), CC_A(CC_C(_, _, _), _, _)) => 2 
  case CC_C(_, ((_,_),(_,_)), CC_A(CC_D(_), _, _)) => 3 
  case CC_D(_) => 4 
}
}