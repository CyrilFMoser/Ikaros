package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: T_B) extends T_A[Boolean]
case class CC_B(a: (T_A[Boolean],T_A[CC_A])) extends T_A[Boolean]
case class CC_C(a: CC_A, b: CC_B, c: T_B) extends T_B

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(CC_A(_, _), _, CC_C(_, _, _))) => 0 
  case CC_B(_) => 1 
}
}