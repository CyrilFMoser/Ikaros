package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B(a: (CC_A[(Char,Int)],CC_A[Byte])) extends T_A[T_A[CC_A[(Int,Char)], CC_A[(Int,Char)]], CC_A[(Int,Char)]]
case class CC_C[D](a: T_A[D, D]) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[CC_A[(Int,Char)], CC_A[(Int,Char)]], CC_A[(Int,Char)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),CC_A())) => 1 
  case CC_C(_) => 2 
}
}