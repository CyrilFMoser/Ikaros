package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]]) extends T_A[Char]
case class CC_B(a: CC_A, b: CC_A) extends T_A[Char]
case class CC_C(a: CC_A) extends T_A[Char]
case class CC_D(a: (T_A[Char],(Int,CC_A)), b: CC_A) extends T_B
case class CC_E(a: T_B) extends T_B
case class CC_F(a: (CC_B,CC_B)) extends T_B

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(_)) => 2 
}
}