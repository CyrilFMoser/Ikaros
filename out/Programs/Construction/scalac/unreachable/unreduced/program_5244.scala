package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[T_B, T_A[T_B, Boolean]], T_A[T_A[Boolean, T_B], T_A[T_B, T_B]]]
case class CC_B(a: CC_A[T_B], b: T_A[T_A[T_B, T_B], Int]) extends T_A[T_A[T_B, T_A[T_B, Boolean]], T_A[T_A[Boolean, T_B], T_A[T_B, T_B]]]
case class CC_C(a: CC_A[Char], b: CC_B) extends T_B
case class CC_D(a: T_A[Boolean, (T_B,Byte)], b: CC_C) extends T_B
case class CC_E(a: (CC_B,CC_B), b: Char, c: Boolean) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), _) => 0 
  case CC_D(_, CC_C(CC_A(), CC_B(_, _))) => 1 
  case CC_E((CC_B(_, _),CC_B(_, _)), _, true) => 2 
  case CC_E((CC_B(_, _),CC_B(_, _)), _, false) => 3 
}
}