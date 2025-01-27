package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_B[T_A],T_B[Boolean]), b: Int) extends T_A
case class CC_B(a: CC_A, b: (T_A,T_A), c: T_B[T_B[(Int,Boolean)]]) extends T_A
case class CC_C(a: Int, b: CC_B, c: CC_A) extends T_B[Char]
case class CC_D() extends T_B[Char]
case class CC_E(a: Int, b: CC_B) extends T_B[Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, _, _) => 2 
}
}