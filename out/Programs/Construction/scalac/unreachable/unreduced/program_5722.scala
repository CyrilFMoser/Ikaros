package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], Char]) extends T_A
case class CC_B(a: Boolean, b: CC_A) extends T_A
case class CC_C(a: T_B[T_A, Byte]) extends T_B[T_A, Byte]
case class CC_D(a: Char, b: CC_A) extends T_B[T_A, Byte]
case class CC_E(a: Char) extends T_B[T_A, Byte]

val v_a: T_B[T_A, Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_))) => 0 
  case CC_C(CC_C(CC_D(_, _))) => 1 
  case CC_C(CC_C(CC_E(_))) => 2 
  case CC_C(CC_D(_, CC_A(_))) => 3 
  case CC_C(CC_E(_)) => 4 
  case CC_D(_, CC_A(_)) => 5 
  case CC_E(_) => 6 
}
}