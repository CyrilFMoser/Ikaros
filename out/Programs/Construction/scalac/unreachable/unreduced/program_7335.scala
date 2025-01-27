package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_B, c: T_A[T_A[T_B]]) extends T_A[T_B]
case class CC_B(a: T_A[T_B]) extends T_A[T_B]
case class CC_C[B](a: Int, b: (T_A[T_B],((Byte,Char),T_B)), c: B) extends T_B
case class CC_D(a: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(12, (CC_A(_, _, _),(_,_)), _) => 0 
  case CC_C(_, (CC_A(_, _, _),(_,_)), _) => 1 
  case CC_C(12, (CC_B(_),(_,_)), _) => 2 
  case CC_C(_, (CC_B(_),(_,_)), _) => 3 
  case CC_D(_) => 4 
}
}