package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[(Boolean,Boolean)]]) extends T_A[T_A[T_B[Char]]]
case class CC_B() extends T_A[T_A[T_B[Char]]]
case class CC_C(a: T_A[CC_A]) extends T_A[T_A[T_B[Char]]]
case class CC_D(a: T_A[CC_C], b: CC_C) extends T_B[Boolean]

val v_a: T_A[T_A[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}