package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Boolean], (Boolean,Char)], b: T_A[Char]) extends T_A[T_B[T_A[(Boolean,Int)], (Int,Char)]]
case class CC_B(a: T_A[CC_A], b: T_B[Int, (CC_A,(Char,Int))], c: T_B[(CC_A,Int), Char]) extends T_A[T_B[T_A[(Boolean,Int)], (Int,Char)]]
case class CC_C() extends T_A[T_B[T_A[(Boolean,Int)], (Int,Char)]]
case class CC_D(a: (T_B[Int, CC_A],CC_B), b: T_B[Int, T_B[CC_B, CC_A]], c: Boolean) extends T_B[T_A[CC_C], T_A[Boolean]]

val v_a: T_A[T_B[T_A[(Boolean,Int)], (Int,Char)]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _)