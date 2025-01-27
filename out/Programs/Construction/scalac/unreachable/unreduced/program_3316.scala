package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: Byte) extends T_A
case class CC_B(a: Boolean, b: Int) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D(a: Char, b: T_B[Char], c: T_B[T_B[Char]]) extends T_B[Char]
case class CC_E(a: T_B[Char]) extends T_B[Char]
case class CC_F(a: CC_B, b: (Int,Char)) extends T_B[Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(_, _)) => 2 
  case CC_C(CC_B(_, _)) => 3 
  case CC_C(CC_C(CC_B(_, _))) => 4 
  case CC_C(CC_C(CC_C(_))) => 5 
}
}
// This is not matched: CC_C(CC_C(CC_A(_, _)))