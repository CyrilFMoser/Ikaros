package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: (T_B,T_A[T_B, Byte]), b: T_B) extends T_A[T_B, (T_B,Int)]
case class CC_B[C](a: (T_A[T_B, CC_A],T_B), b: C) extends T_A[C, CC_A]
case class CC_C() extends T_A[T_B, (T_B,Int)]
case class CC_D(a: CC_C, b: T_A[T_B, (T_B,Int)]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A((_,_), _)) => 0 
  case CC_D(_, CC_C()) => 1 
}
}