package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: T_A[CC_A], b: T_A[CC_A]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: Boolean, b: T_A[Boolean], c: CC_B) extends T_A[T_A[(CC_A,CC_B)]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}