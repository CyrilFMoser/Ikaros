package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: T_A[T_B], b: T_A[Boolean]) extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_D(a: CC_A, b: Char) extends T_B
case class CC_E(a: CC_C, b: Int, c: (T_B,CC_C)) extends T_B
case class CC_F(a: CC_D) extends T_B

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_D(_, _)) => 2 
  case CC_C(CC_E(CC_C(_), _, (_,_))) => 3 
}
}
// This is not matched: CC_C(CC_F(CC_D(_, _)))