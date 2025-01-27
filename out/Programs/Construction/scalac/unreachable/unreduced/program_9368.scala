package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D](a: (T_A[(Int,Int), Int],CC_A[Char])) extends T_A[T_A[D, D], D]
case class CC_C(a: Boolean) extends T_A[T_A[CC_B[Int], CC_B[Int]], CC_B[Int]]

val v_a: T_A[T_A[CC_C, CC_C], CC_C] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,CC_A())) => 1 
}
}