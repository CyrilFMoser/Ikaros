package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: ((T_A,T_A),T_B[Boolean, T_A]), b: T_B[T_B[T_A, Byte], T_B[T_A, Boolean]], c: T_A) extends T_A
case class CC_B(a: Boolean, b: Char, c: T_B[Char, Char]) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D[C](a: C, b: CC_C) extends T_B[C, T_B[T_A, CC_A]]

val v_a: T_B[CC_C, T_B[T_A, CC_A]] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_), CC_C(CC_A(_, _, _))) => 0 
  case CC_D(CC_C(_), CC_C(CC_B(_, _, _))) => 1 
  case CC_D(CC_C(_), CC_C(CC_C(_))) => 2 
}
}