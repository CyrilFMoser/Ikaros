package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Int, Boolean], T_A[Int, Int]], C]
case class CC_B(a: (Int,CC_A[Int])) extends T_A[T_A[T_A[Int, Boolean], T_A[Int, Int]], T_A[CC_A[Boolean], (Char,Byte)]]
case class CC_C(a: Int, b: T_A[T_A[CC_B, CC_B], T_A[CC_B, CC_B]]) extends T_A[T_A[T_A[Int, Boolean], T_A[Int, Int]], T_A[CC_A[Boolean], (Char,Byte)]]

val v_a: T_A[T_A[T_A[Int, Boolean], T_A[Int, Int]], T_A[CC_A[Boolean], (Char,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(12, _) => 2 
  case CC_C(_, _) => 3 
}
}