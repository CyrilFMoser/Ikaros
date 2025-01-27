package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Byte, T_A], b: (T_A,T_B[T_A, (Char,Boolean)]), c: T_B[T_A, T_A]) extends T_A
case class CC_B(a: (T_B[CC_A, CC_A],T_A), b: T_A) extends T_A
case class CC_C(a: Boolean, b: T_B[T_B[CC_B, CC_A], Char], c: T_B[CC_A, CC_B]) extends T_B[T_B[CC_B, CC_A], Char]
case class CC_D(a: T_B[Int, CC_C]) extends T_B[T_B[CC_B, CC_A], Char]
case class CC_E(a: T_B[T_B[CC_B, CC_A], Char]) extends T_B[T_B[CC_B, CC_A], Char]

val v_a: T_B[T_B[CC_B, CC_A], Char] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_) => 1 
  case CC_E(CC_C(_, CC_C(_, _, _), _)) => 2 
  case CC_E(CC_C(_, CC_D(_), _)) => 3 
  case CC_E(CC_C(_, CC_E(_), _)) => 4 
  case CC_E(CC_D(_)) => 5 
  case CC_E(CC_E(CC_C(_, _, _))) => 6 
  case CC_E(CC_E(CC_D(_))) => 7 
  case CC_E(CC_E(CC_E(_))) => 8 
}
}