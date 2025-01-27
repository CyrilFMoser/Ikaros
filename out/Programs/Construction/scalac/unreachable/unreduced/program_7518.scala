package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[T_A[T_B, C], T_B]) extends T_A[T_B, C]
case class CC_B(a: (T_A[T_B, T_B],CC_A[T_B])) extends T_B
case class CC_C() extends T_B
case class CC_D(a: (CC_C,Char), b: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B((CC_A(_, _),CC_A(_, _))) => 0 
  case CC_C() => 1 
  case CC_D((CC_C(),_), _) => 2 
}
}