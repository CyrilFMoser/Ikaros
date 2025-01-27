package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[C, T_B]
case class CC_B[D](a: T_A[D, D], b: (T_B,((Boolean,Byte),T_B)), c: T_A[D, T_B]) extends T_A[D, T_B]
case class CC_C(a: CC_B[CC_B[Char]], b: T_A[(T_B,T_B), T_B]) extends T_B
case class CC_D() extends T_B

val v_a: T_A[Char, T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_B(_, _, _), CC_A(_))) => 0 
  case CC_A(CC_C(CC_B(_, _, _), CC_B(_, _, _))) => 1 
  case CC_A(CC_D()) => 2 
  case CC_B(_, (CC_C(_, _),(_,_)), _) => 3 
  case CC_B(_, (CC_D(),(_,_)), _) => 4 
}
}