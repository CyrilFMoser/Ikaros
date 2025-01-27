package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Char, b: (T_A[T_B, Boolean],(T_B,Byte)), c: Int) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[T_B, T_A[T_B, T_B]]) extends T_B
case class CC_C(a: (T_B,T_B), b: Byte, c: CC_A[T_A[T_B, Byte]]) extends T_B
case class CC_D[D](a: (CC_C,T_A[(Byte,Byte), Byte]), b: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, (_,_), _)) => 0 
  case CC_C((CC_B(_),CC_B(_)), _, _) => 1 
  case CC_C((CC_B(_),CC_C(_, _, _)), _, _) => 2 
  case CC_C((CC_B(_),CC_D(_, _)), _, _) => 3 
  case CC_C((CC_C(_, _, _),CC_B(_)), _, _) => 4 
  case CC_C((CC_C(_, _, _),CC_C(_, _, _)), _, _) => 5 
  case CC_C((CC_C(_, _, _),CC_D(_, _)), _, _) => 6 
  case CC_C((CC_D(_, _),CC_B(_)), _, _) => 7 
  case CC_C((CC_D(_, _),CC_C(_, _, _)), _, _) => 8 
  case CC_C((CC_D(_, _),CC_D(_, _)), _, _) => 9 
  case CC_D((CC_C(_, _, _),_), _) => 10 
}
}