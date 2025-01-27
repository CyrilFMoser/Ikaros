package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Byte]]) extends T_A[(T_A[Int],T_A[Int])]
case class CC_B() extends T_A[(T_A[Int],T_A[Int])]
case class CC_C[C](a: C, b: (Boolean,CC_A)) extends T_A[(T_A[Int],T_A[Int])]
case class CC_D(a: (Boolean,T_A[CC_B]), b: Byte, c: CC_C[Boolean]) extends T_B[Byte]

val v_a: T_A[(T_A[Int],T_A[Int])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, (_,CC_A(_)))