package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int) extends T_A[C, T_A[C, C]]
case class CC_B(a: Int, b: (CC_A[Char],Char), c: T_A[Boolean, CC_A[Char]]) extends T_A[T_A[Boolean, T_A[Boolean, Boolean]], T_A[T_A[Boolean, T_A[Boolean, Boolean]], T_A[Boolean, T_A[Boolean, Boolean]]]]
case class CC_C[D]() extends T_A[D, T_A[D, D]]

val v_a: T_A[T_A[Boolean, T_A[Boolean, Boolean]], T_A[T_A[Boolean, T_A[Boolean, Boolean]], T_A[Boolean, T_A[Boolean, Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}