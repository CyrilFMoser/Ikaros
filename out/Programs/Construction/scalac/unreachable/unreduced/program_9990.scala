package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B, (Int,Char)], T_A[T_B, T_B]], b: T_B, c: Int) extends T_A[T_A[T_B, T_B], T_A[T_B, T_B]]
case class CC_B[C]() extends T_A[Boolean, C]
case class CC_C(a: (T_A[Int, T_B],T_A[Boolean, T_B]), b: T_A[Byte, T_A[Boolean, Byte]]) extends T_B
case class CC_D(a: T_A[T_A[T_B, T_B], T_A[T_B, T_B]]) extends T_B
case class CC_E(a: CC_B[T_A[Boolean, T_B]], b: T_A[T_A[T_B, T_B], T_A[T_B, T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C((_,CC_B()), _) => 0 
  case CC_D(_) => 1 
  case CC_E(_, _) => 2 
}
}