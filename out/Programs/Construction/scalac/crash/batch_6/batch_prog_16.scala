package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_B) extends T_A[T_A[T_A[T_B, T_B], T_A[T_B, T_B]], C]
case class CC_B[D](a: T_A[D, D], b: CC_A[D]) extends T_A[D, (T_A[Boolean, T_B],Byte)]
case class CC_C[E](a: CC_B[E], b: (Byte,(Boolean,(Char,Boolean))), c: T_A[E, E]) extends T_A[T_A[T_A[T_B, T_B], T_A[T_B, T_B]], E]
case class CC_D() extends T_B
case class CC_E(a: T_B) extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_D()) => 1 
  case CC_E(CC_E(CC_D())) => 2 
  case CC_E(CC_E(CC_E(_))) => 3 
  case CC_E(CC_E(CC_F())) => 4 
  case CC_E(CC_F()) => 5 
  case CC_F() => 6 
}
}