package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[Int, T_A[Byte, Int]]) extends T_A[(CC_A[Int],(Char,Int)), T_A[(CC_A[Int],(Char,Int)), (CC_A[Int],(Char,Int))]]
case class CC_C(a: ((CC_B,Int),CC_B), b: CC_A[T_A[CC_B, (Char,Byte)]], c: Int) extends T_A[(CC_A[Int],(Char,Int)), T_A[(CC_A[Int],(Char,Int)), (CC_A[Int],(Char,Int))]]

val v_a: T_A[(CC_A[Int],(Char,Int)), T_A[(CC_A[Int],(Char,Int)), (CC_A[Int],(Char,Int))]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_)) => 1 
  case CC_A(CC_C((_,_), CC_A(_), _)) => 2 
  case CC_B(_) => 3 
  case CC_C(((_,_),CC_B(_)), _, _) => 4 
}
}