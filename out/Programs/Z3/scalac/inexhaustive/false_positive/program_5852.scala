package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_A[Int, Int], T_A[Int, Char]]
case class CC_B() extends T_A[T_A[Int, Int], T_A[Int, Char]]
case class CC_C[E]() extends T_B[T_B[CC_B, CC_A], E]
case class CC_D(a: (Int,CC_A)) extends T_B[T_B[CC_B, CC_A], CC_C[CC_A]]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D((12,_)) => 0 
}
}
// This is not matched: (CC_B Int
//      (CC_A Int (T_A Int (T_A Byte Boolean)))
//      (CC_A Int (T_A Int (T_A Byte Boolean)))
//      Wildcard
//      (T_A Int (T_A Byte Boolean)))