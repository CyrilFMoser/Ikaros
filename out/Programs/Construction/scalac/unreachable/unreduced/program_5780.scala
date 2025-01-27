package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_A[T_B, (Boolean,Char)],T_A[Boolean, T_B])) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_B, b: Int) extends T_A[Byte, T_A[Byte, Byte]]
case class CC_C() extends T_A[Byte, T_A[Byte, Byte]]
case class CC_D(a: (T_A[T_B, Int],CC_B), b: T_A[T_A[Boolean, T_B], T_A[T_A[Boolean, T_B], T_A[Boolean, T_B]]]) extends T_B

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_B(CC_D((_,_), _), _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A((_,_))