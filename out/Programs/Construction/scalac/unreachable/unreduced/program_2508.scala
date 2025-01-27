package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Byte]]) extends T_A[T_A[T_B[Char]]]
case class CC_B() extends T_A[T_A[T_B[Char]]]
case class CC_C(a: (T_B[CC_B],Boolean)) extends T_B[(T_B[CC_B],Boolean)]
case class CC_D() extends T_B[(T_B[CC_B],Boolean)]

val v_a: T_A[T_A[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}