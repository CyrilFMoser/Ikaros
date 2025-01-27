package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[(Byte,T_A[Int])]
case class CC_B(a: T_A[T_A[CC_A]], b: (CC_A,CC_A)) extends T_A[(Byte,T_A[Int])]
case class CC_C(a: T_A[CC_B]) extends T_A[(Byte,T_A[Int])]

val v_a: T_A[(Byte,T_A[Int])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_, _)