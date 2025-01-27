package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: Char, c: Boolean) extends T_A[T_A[C, C], C]
case class CC_B() extends T_A[T_A[T_A[CC_A[Int], T_A[Int, Int]], T_A[CC_A[Int], T_A[Int, Int]]], T_A[CC_A[Int], T_A[Int, Int]]]
case class CC_C[D]() extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[T_A[CC_A[Int], T_A[Int, Int]], T_A[CC_A[Int], T_A[Int, Int]]], T_A[CC_A[Int], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C()