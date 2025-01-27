package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B() extends T_B
case class CC_C(a: T_A[(Byte,T_B), CC_B], b: T_A[Boolean, T_A[T_B, T_B]]) extends T_B
case class CC_D(a: (T_A[T_B, CC_C],Boolean)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
  case CC_D((_,_)) => 2 
}
}