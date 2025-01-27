package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Byte, Int], Byte]]
case class CC_B(a: (T_A[Boolean, Boolean],CC_A[Int])) extends T_A[CC_A[CC_A[Boolean]], T_A[T_A[Byte, Int], Byte]]
case class CC_C(a: CC_B) extends T_A[CC_A[CC_A[Boolean]], T_A[T_A[Byte, Int], Byte]]

val v_a: T_A[CC_A[CC_A[Boolean]], T_A[T_A[Byte, Int], Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,CC_A())) => 1 
  case CC_C(CC_B(_)) => 2 
}
}