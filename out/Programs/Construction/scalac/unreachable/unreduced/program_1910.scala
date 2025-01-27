package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Byte, b: T_A[T_A[Byte, Char], T_A[Byte, Boolean]], c: T_A[T_A[Int, Int], T_A[Byte, Byte]]) extends T_A[T_A[(Char,(Boolean,Boolean)), Int], T_A[T_A[Byte, Boolean], (Char,Char)]]
case class CC_B(a: (CC_A,T_A[CC_A, (Boolean,Int)]), b: Byte, c: CC_A) extends T_A[T_A[(Char,(Boolean,Boolean)), Int], T_A[T_A[Byte, Boolean], (Char,Char)]]
case class CC_C(a: T_A[Byte, CC_B], b: Byte) extends T_A[T_A[(Char,(Boolean,Boolean)), Int], T_A[T_A[Byte, Boolean], (Char,Char)]]

val v_a: T_A[T_A[(Char,(Boolean,Boolean)), Int], T_A[T_A[Byte, Boolean], (Char,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}