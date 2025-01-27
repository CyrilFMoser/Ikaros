package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: T_B, b: T_A[CC_A]) extends T_A[CC_A]
case class CC_C(a: CC_B, b: (T_A[CC_A],T_A[CC_A])) extends T_A[T_A[T_A[Boolean]]]
case class CC_D(a: CC_B, b: T_A[CC_A], c: T_A[T_A[CC_A]]) extends T_B
case class CC_E(a: Char) extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(_) => 1 
  case CC_F() => 2 
}
}