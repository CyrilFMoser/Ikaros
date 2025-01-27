package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Char) extends T_A[Boolean, D]
case class CC_B[E](a: (T_A[(Byte,Char), Byte],(Byte,Int)), b: T_A[Boolean, E]) extends T_A[Boolean, E]
case class CC_C() extends T_B[T_A[Boolean, T_A[Boolean, (Char,Boolean)]]]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,(_,_)), CC_A(_)) => 1 
  case CC_B((_,(_,_)), CC_B((_,_), CC_B(_, _))) => 2 
}
}
// This is not matched: CC_B((_,(_,_)), CC_B((_,_), CC_A(_)))