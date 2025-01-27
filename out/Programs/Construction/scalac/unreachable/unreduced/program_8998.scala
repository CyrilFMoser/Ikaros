package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_A, b: B) extends T_A
case class CC_B(a: T_B[T_B[T_A]], b: T_B[T_A]) extends T_B[(T_B[T_A],(T_A,T_A))]
case class CC_C(a: CC_B, b: T_A) extends T_B[(T_B[T_A],(T_A,T_A))]

val v_a: T_B[(T_B[T_A],(T_A,T_A))] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, _) => 1 
}
}