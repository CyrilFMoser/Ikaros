package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[T_A[Byte, Byte], CC_A[Boolean]], b: (T_A[Int, Byte],T_A[Int, Byte]), c: T_A[T_A[Int, Int], T_A[T_A[Int, Int], T_A[Int, Int]]]) extends T_A[CC_A[T_A[Boolean, Boolean]], T_A[CC_A[T_A[Boolean, Boolean]], CC_A[T_A[Boolean, Boolean]]]]

val v_a: T_A[CC_A[T_A[Boolean, Boolean]], T_A[CC_A[T_A[Boolean, Boolean]], CC_A[T_A[Boolean, Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
}
}