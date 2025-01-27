package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Int, (Boolean,Boolean)], T_A[Int, Boolean]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[Int, (Boolean,Boolean)], T_A[Int, Boolean]]]
case class CC_C[E](a: E, b: T_A[E, E], c: CC_B[E]) extends T_A[E, T_A[T_A[Int, (Boolean,Boolean)], T_A[Int, Boolean]]]

val v_a: T_A[Boolean, T_A[T_A[Int, (Boolean,Boolean)], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}