package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A]) extends T_A
case class CC_C(a: CC_A) extends T_B[T_B[T_B[(Int,Int)]]]
case class CC_D() extends T_B[T_B[T_B[(Int,Int)]]]
case class CC_E(a: CC_B, b: T_A, c: CC_D) extends T_B[T_B[T_B[(Int,Int)]]]

val v_a: T_B[T_B[T_B[(Int,Int)]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
  case CC_E(_, CC_A(), _) => 1 
  case CC_E(_, CC_B(_), _) => 2 
}
}
// This is not matched: CC_D()