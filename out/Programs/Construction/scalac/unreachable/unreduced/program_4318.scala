package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Char, b: Boolean, c: (T_A[T_B, T_B],T_A[(Char,Char), T_B])) extends T_A[T_B, C]
case class CC_B(a: CC_A[(T_B,T_B)], b: Byte) extends T_B
case class CC_C(a: (Byte,(CC_B,Int)), b: T_A[CC_B, (T_B,CC_B)], c: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C((_,(_,_)), _, CC_B(CC_A(_, _, _), _)) => 1 
  case CC_C((_,(_,_)), _, CC_C(_, _, CC_B(_, _))) => 2 
}
}
// This is not matched: CC_C((_,(_,_)), _, CC_C(_, _, CC_C(_, _, _)))