package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Boolean, b: Char, c: T_B) extends T_A[T_A[T_B, T_B], C]
case class CC_B[D](a: CC_A[D], b: T_B) extends T_A[T_A[T_B, T_B], D]
case class CC_C(a: T_A[T_A[T_B, T_B], CC_B[T_B]], b: Boolean, c: T_A[T_A[T_B, T_B], T_B]) extends T_B
case class CC_D(a: Char, b: Byte) extends T_B
case class CC_E(a: (CC_A[CC_C],T_A[T_B, CC_D]), b: T_A[CC_B[T_B], T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A(_, _, CC_C(_, _, _))) => 0 
  case CC_C(_, _, CC_A(_, _, CC_D(_, _))) => 1 
  case CC_C(_, _, CC_A(_, _, CC_E(_, _))) => 2 
  case CC_C(_, _, CC_B(CC_A(_, _, _), _)) => 3 
  case CC_D(_, _) => 4 
  case CC_E((CC_A(_, _, _),_), _) => 5 
}
}