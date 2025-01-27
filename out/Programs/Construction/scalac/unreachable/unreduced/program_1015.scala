package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B[D](a: T_B, b: T_A[T_B, D]) extends T_A[T_B, D]
case class CC_C[E](a: CC_B[E], b: T_A[T_B, E]) extends T_A[T_B, E]
case class CC_D() extends T_B
case class CC_E(a: (CC_A[Byte],T_A[T_B, CC_D]), b: CC_A[T_A[T_B, CC_D]], c: (T_A[T_B, Boolean],CC_C[(Char,Byte)])) extends T_B
case class CC_F(a: CC_D, b: (T_B,T_A[CC_D, T_B])) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, CC_A(_), _) => 1 
  case CC_F(_, (_,_)) => 2 
}
}