package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (((Byte,Int),Int),T_B[Char, Int])) extends T_A[D]
case class CC_B(a: CC_A[(Byte,Byte)], b: CC_A[T_A[Boolean]]) extends T_A[(T_A[Boolean],T_A[Boolean])]
case class CC_C() extends T_A[(T_A[Boolean],T_A[Boolean])]
case class CC_D[E](a: T_A[E], b: T_A[E]) extends T_B[E, T_B[E, E]]

val v_a: T_A[(T_A[Boolean],T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),_)) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _)