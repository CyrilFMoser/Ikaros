package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[(T_B,T_B)], b: Int, c: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: (T_A[(Char,Boolean)],T_B), b: Byte) extends T_A[T_B]
case class CC_C(a: CC_B) extends T_A[T_B]

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_B((_,_), 0)) => 2 
  case CC_C(CC_B((_,_), _)) => 3 
}
}