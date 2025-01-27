package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_B[D], b: T_A[D]) extends T_A[D]
case class CC_C(a: T_B[T_A[Int]]) extends T_B[T_A[(Char,Char)]]
case class CC_D(a: (CC_B[CC_C],T_A[(Int,Char)]), b: T_A[(CC_C,CC_C)], c: CC_B[T_A[CC_C]]) extends T_B[T_B[CC_A[Boolean]]]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_B(_, CC_A())) => 1 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 2 
}
}
// This is not matched: CC_B(_, CC_A())