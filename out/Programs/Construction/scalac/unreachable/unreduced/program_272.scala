package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[(T_B,T_B)]) extends T_A[T_A[T_A[T_B]]]
case class CC_B() extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: (CC_B,CC_A), b: T_B, c: T_B) extends T_A[(CC_B,Boolean)]
case class CC_D(a: (Boolean,CC_B), b: Boolean, c: (CC_C,T_A[CC_A])) extends T_B

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}