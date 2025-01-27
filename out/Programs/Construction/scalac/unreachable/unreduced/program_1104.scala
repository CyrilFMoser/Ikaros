package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: Byte, b: T_A[E, D], c: (T_A[Char, Char],T_A[Boolean, (Byte,Byte)])) extends T_A[T_B[D], D]
case class CC_B() extends T_B[T_A[Boolean, Boolean]]
case class CC_C(a: Char, b: (T_A[CC_B, Int],(CC_B,(Char,Char)))) extends T_B[T_A[Boolean, Boolean]]

val v_a: T_B[T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C('x', (_,_)) => 1 
}
}
// This is not matched: CC_C(_, (_,_))