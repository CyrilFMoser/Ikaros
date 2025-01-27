package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B, T_B]
case class CC_B(a: (T_A[T_B, T_B],Byte)) extends T_A[T_B, T_B]
case class CC_C(a: (T_A[T_B, CC_B],Byte), b: T_A[T_A[T_B, T_B], T_A[T_B, T_B]]) extends T_B
case class CC_D(a: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_A(_)) => 1 
}
}