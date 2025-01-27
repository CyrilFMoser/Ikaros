package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E]() extends T_B[E, T_A[E]]
case class CC_C() extends T_B[CC_A[T_A[Boolean]], T_A[CC_A[T_A[Boolean]]]]
case class CC_D(a: T_B[Boolean, T_B[Char, CC_C]], b: T_A[Boolean], c: T_A[Char]) extends T_B[CC_A[T_A[Boolean]], T_A[CC_A[T_A[Boolean]]]]

val v_a: T_B[CC_A[T_A[Boolean]], T_A[CC_A[T_A[Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C() => 1 
  case CC_D(_, CC_A(), CC_A()) => 2 
}
}