package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[(T_B,(Int,Int))]]
case class CC_B(a: T_B) extends T_A[T_A[T_B]]
case class CC_C() extends T_A[T_B]
case class CC_D(a: T_A[CC_A]) extends T_B
case class CC_E(a: Boolean, b: Char, c: T_A[T_A[T_B]]) extends T_B
case class CC_F(a: CC_B, b: T_A[T_B], c: (CC_E,CC_E)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(_, _, _) => 1 
  case CC_F(CC_B(_), _, (CC_E(_, _, _),CC_E(_, _, _))) => 2 
}
}