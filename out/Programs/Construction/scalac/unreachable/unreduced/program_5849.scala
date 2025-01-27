package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_A[D], b: (Byte,T_B[Byte])) extends T_A[C]
case class CC_B[E](a: T_B[E]) extends T_A[E]
case class CC_C(a: T_A[CC_B[Char]], b: Int) extends T_B[CC_B[T_A[(Char,Int)]]]
case class CC_D() extends T_B[CC_B[T_A[(Char,Int)]]]
case class CC_E() extends T_B[CC_B[T_A[(Char,Int)]]]

val v_a: T_B[CC_B[T_A[(Char,Int)]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_), _) => 0 
  case CC_D() => 1 
  case CC_E() => 2 
}
}
// This is not matched: CC_C(CC_A(_, (_,_)), _)