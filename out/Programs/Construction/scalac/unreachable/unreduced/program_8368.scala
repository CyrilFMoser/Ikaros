package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[CC_A, T_A]) extends T_A
case class CC_C[C](a: T_B[C, C]) extends T_B[C, CC_A]
case class CC_D(a: CC_C[CC_A]) extends T_B[(CC_B,T_B[T_A, CC_A]), CC_A]
case class CC_E(a: CC_D, b: T_B[T_B[CC_A, CC_A], CC_A], c: T_B[Char, CC_A]) extends T_B[(CC_B,T_B[T_A, CC_A]), CC_A]

val v_a: T_B[(CC_B,T_B[T_A, CC_A]), CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_C(CC_C(_))) => 1 
  case CC_E(CC_D(CC_C(_)), _, CC_C(_)) => 2 
}
}