package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D](a: (CC_A[Boolean],Byte)) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: (T_A[Byte, Boolean],(Char,Int))) extends T_A[E, T_A[E, E]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(),_)) => 0 
  case CC_C((_,(_,_))) => 1 
}
}
// This is not matched: CC_A()