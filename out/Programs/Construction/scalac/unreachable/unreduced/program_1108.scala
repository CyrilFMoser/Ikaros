package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B(a: (T_A,CC_A), b: T_A) extends T_A
case class CC_C(a: CC_B) extends T_B[T_B[Char]]
case class CC_D(a: Int, b: T_B[CC_C], c: CC_C) extends T_B[T_B[Char]]
case class CC_E(a: CC_C) extends T_B[T_B[Char]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,_), _) => 1 
}
}