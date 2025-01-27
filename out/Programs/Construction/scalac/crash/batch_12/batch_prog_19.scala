package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B(a: T_A[Int], b: CC_A[Int]) extends T_A[T_A[CC_A[Int]]]
case class CC_C[C](a: T_A[C], b: C) extends T_A[C]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _) => 1 
}
}